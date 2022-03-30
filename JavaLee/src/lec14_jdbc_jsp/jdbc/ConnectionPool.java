package lec14_jdbc_jsp.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

/**
 * ConnectionFactory로 부터 maxConn만큼
 * Connection 객체를 생성해서 풀(Pool)에 보관하는 클래스
 */
public class ConnectionPool {
	// ArrayList는 동기화 미지원
	// Vector는 동기화(synchronized)가 적용되는 ArrayList이다
	private static Vector<Connection> pool = new Vector<Connection>();
	
	private static ConnectionPool instance = new ConnectionPool();
	
	public static ConnectionPool getInstance() {
		if(instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}
	
	private ConnectionPool() {
		try {
			initPool();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private synchronized void initPool() throws SQLException {
		destroyPool();
		
		ConnectionFactory factory = ConnectionFactory.getInstance();
		int maxConn = factory.getMaxConn();
		
		for(int i = 0; i < maxConn; i++) {
			pool.add(factory.getConnection());
		}
	}
	
	private synchronized void destroyPool() throws SQLException {
		for(Connection conn : pool) {
			conn.close();
		}
		pool.clear();
	}
	
	public synchronized Connection getConnection() {
		// 인덱스 3에있는 객체를 지움과 동시에 conn에 넣어준다.
		// 쓸 때마다 remove해줘 하나씩 줄어들기 때문에
		// 다 없어지면 wait을 걸어준다.
		if(pool.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Connection conn = pool.remove(pool.size() - 1);
		
		return conn;
	}
	
	public synchronized void releaseConnction(Connection conn) {
		// 다시 추가해주고 깨워준다(notify)
		pool.add(conn);
		notify();
	}
	
	
	
	
	
	
}
