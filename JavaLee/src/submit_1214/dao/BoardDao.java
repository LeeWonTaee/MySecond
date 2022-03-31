package submit_1214.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import submit_1214.model.BoardVO;
import submit_1214.model.MemberVO;

public class BoardDao {
	private static BoardDao instance = new BoardDao();
	
	private BoardDao() {
		
	}
	
	public static BoardDao getInstance() {
		if(instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	
	public ArrayList<BoardVO> boardList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT						");
		query.append("		 bo_no				");
		query.append("		,bo_title			");
		query.append("		,bo_content		");
		query.append("		,bo_id				");
		query.append("		,bo_date			");
		query.append("FROM						");
		query.append("	board 					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		
		ArrayList<BoardVO> result = new ArrayList<BoardVO>();
		
		while(rs.next()){
			BoardVO temp = new BoardVO();
			
			temp.setBoNo(rs.getInt("bo_no"));
			temp.setBoTitle(rs.getString("bo_title"));
			temp.setBoContent(rs.getString("bo_content"));
			temp.setMemId(rs.getString("bo_id"));
			temp.setBoDate(rs.getString("bo_date"));
			
			result.add(temp);
		}
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		
		return result;
	}
	
	public int insertBoard(Connection conn, String title, String content, MemberVO id) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO					");
		query.append("			board				");
		query.append("VALUES (						");
		query.append("		 board_seq.nextval	");
		query.append("		, ?						");
		query.append("		, ?						");
		query.append("		, ?						");
		query.append("		, ?						");
		query.append("		)						");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		BoardVO temp = new BoardVO(title, content, id);
		
		ps.setString(idx++, title);
		ps.setString(idx++, content);
		ps.setString(idx++, id.getMemId());
		ps.setString(idx++, temp.getBoDate());
		
		
		int cnt = ps.executeUpdate();
		
		if(ps != null) ps.close();
		
		return cnt;
	}
	
	
	// 게시글 조회
	public BoardVO selectBoard(Connection conn, int no) throws SQLException{
		
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT						");
		query.append("		 bo_no				");
		query.append("		,bo_title			");
		query.append("		,bo_content		");
		query.append("		,bo_id				");
		query.append("		,bo_date			");
		query.append("FROM						");
		query.append("	board					");
		query.append("WHERE 1=1					");
		query.append("AND   bo_no = ?			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setInt(1, no);
		ResultSet rs = ps.executeQuery();
		
		BoardVO temp = new BoardVO();
		
		while(rs.next()){
			temp.setBoNo(rs.getInt("bo_no"));
			temp.setBoTitle(rs.getString("bo_title"));
			temp.setBoContent(rs.getString("bo_content"));
			temp.setMemId(rs.getString("bo_id"));
			temp.setBoDate(rs.getString("bo_date"));

		}
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		
		return temp;
	}

	
	
}
