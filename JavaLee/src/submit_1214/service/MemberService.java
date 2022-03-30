package submit_1214.service;


import java.sql.Connection;
import java.sql.SQLException;

import submit_1214.dao.MemberDao;
import submit_1214.jdbc.ConnectionPool;
import submit_1214.model.MemberVO;


public class MemberService {
	
	private static MemberService instance = new MemberService();
	private MemberDao dao = MemberDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private MemberService() {
		
	}
	
	public static MemberService getInstance() {
		if(instance == null) {
			instance = new MemberService();
		}
		return instance;
	}
	// 회원가입
	public int insertMember(String id, String pw) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.insertMember(conn, id, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn);
		}
		return 0;
	}
	
	public MemberVO getMem(String id) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.getMem(conn, id);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn);
		}
		
		return new MemberVO();
	}

	
}
