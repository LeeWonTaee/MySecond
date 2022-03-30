package submit_1214.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	private String driver;
	private String url;
	private String user;
	private String password;
	private int maxConn;
	
	private static ConnectionFactory instance = new ConnectionFactory();
	
	public static ConnectionFactory getInstance() {
		if(instance == null) {
			instance = new ConnectionFactory();
		}
		return instance;
	}
	
	private ConnectionFactory() {
		try {
			Properties prop = new Properties();
			
			InputStream reader = getClass().getClassLoader().getResourceAsStream("lec14_jdbc_jsp/db.properties");
			prop.load(reader);
			
			this.driver = prop.getProperty("driver");
			this.url = prop.getProperty("url");
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
			this.maxConn = Integer.parseInt(prop.getProperty("maxConn"));
			
			
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public int getMaxConn() {
		return maxConn;
	}
}
