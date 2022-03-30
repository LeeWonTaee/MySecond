package submit.submit_1011.submit01;

public class Board {
	private int no;
	private String title;
	private String date;
	private String content;
	
	public Board(int no, String title, String content, String date) {
		super();
		this.no = no;
		this.title = title;
		this.date = date;
		this.content = content;
	}

	@Override
	public String toString() {
		return "["+ no + ". |" + title + " | "+ date + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
