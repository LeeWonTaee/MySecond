package submit.submit_1011.submit01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardDB {
	private BoardDB() {
		
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	private ArrayList<Board> boardList = new ArrayList<Board>();
	
	public void addBoard(Board board) {
		boardList.add(board);
	}
	
	public int sizeBoard() {
		return boardList.size() + 1;
	}
	
	public String dateBoard() {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		Date date = new Date();
		String strDay = sdf.format(date);
		return strDay;
	}

	
	public void showList() {
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i).toString());
		}
	}
}
