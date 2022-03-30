package submit_1214.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import submit_1214.model.MemberVO;

public class MemberDao {
	private static MemberDao instance = new MemberDao();
	
	private MemberDao() {
		
	}
	
	public static MemberDao getInstance() {
		if(instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	public int insertMember(Connection conn, String id, String pw) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO				");
		query.append("			members		");
		query.append("VALUES (					");
		query.append("		  ?					");
		query.append("		, ?					");
		query.append("		)					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		MemberVO temp = new MemberVO(id, pw);
		int idx = 1;
		ps.setString(idx++, temp.getMemId());
		ps.setString(idx++, temp.getMemPw());
		
		int cnt = ps.executeUpdate();
		
		if(ps != null) ps.close();
		
		return cnt;
	}
	
	public MemberVO getMem(Connection conn, String id) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT   					");
		query.append("		mem_id 			");
		query.append("      ,mem_pw				");
		query.append("FROM  						");
		query.append("		members			");
		query.append("WHERE	1=1					");
		query.append("		AND mem_id = ?	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		
		MemberVO temp = new MemberVO();
		
		while(rs.next()) {
			temp.setMemId(rs.getString("mem_id"));
			temp.setMemPw(rs.getString("mem_pw"));
		}
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		
		return temp;
	}
	
	
	
}
