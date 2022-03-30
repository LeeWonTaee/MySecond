package lec14_jdbc_jsp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import lec14_jdbc_jsp.dao.StudentDao;
import lec14_jdbc_jsp.jdbc.ConnectionPool;
import lec14_jdbc_jsp.model.Student;

public class StudentService {
	
	private static StudentService instance = new StudentService();
	private StudentDao dao = StudentDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private StudentService() {
		
	}
	
	public static StudentService getInstance() {
		if(instance == null) {
			instance = new StudentService();
		}
		return instance;
	}
	
	// 회원목록 조회(SELECT)
	public ArrayList<Student> stuList(){
		Connection conn = cp.getConnection();
		
		// throws
		try {
			return dao.stuList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn); // pool에다 돌려 놓는다.
		}
		
//		return null; // 메인에서 null 체크를 해야함
		return new ArrayList<Student>(); // 빈 배열을 넘겨준다.
	}
	
	// 회원추가 (INSERT)
	public int insertStu(Student student) {
		Connection conn = cp.getConnection();
		
		// throws
		try {
			return dao.insertStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn); // pool에다 돌려 놓는다.
		}
		
		return 0; // 실패했을때 0리턴(추가)
	}
	
	// 회원 수정
	public int updateStu(Student student) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.updateStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn);
		}
		
		return 0;
	}
	
	// 회원 삭제
	public int deleteStu(Student student) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.deleteStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn);
		}
		
		return 0;
	}
	
	// 회원 전체 삭제
	public int deleteAll() {
		Connection conn = cp.getConnection();
		
		try {
			return dao.deleteAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnction(conn);
		}
		
		return 0;
	}
	
	
	
	
	
	
}
