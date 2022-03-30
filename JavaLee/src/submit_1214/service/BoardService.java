package submit_1214.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import submit_1214.dao.BoardDao;
import submit_1214.jdbc.ConnectionPool;
import submit_1214.model.BoardVO;
import submit_1214.model.MemberVO;


public class BoardService {
	
	private static BoardService instance = new BoardService();
	private static BoardDao dao = BoardDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private BoardService() {
		
	}
	
	public static BoardService getInstnace() {
		if(instance == null) {
			instance = new BoardService();
		}
		return instance;
	}
	
	public ArrayList<BoardVO> boardList(){
		Connection conn = cp.getConnection();
		
		try {
			return dao.boardList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn);
		}
		
		return new ArrayList<BoardVO>();
	}
	
	public int insertBoard(String title, String content, MemberVO id) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.insertBoard(conn, title, content, id);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn);
		}
		return 0;
	}
	
	public BoardVO selectBoard(int no) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.selectBoard(conn, no);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn);
		}
		
		return new BoardVO();
	}

}
