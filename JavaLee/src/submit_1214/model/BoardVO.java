package submit_1214.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoardVO {
	private int boNo;
	private String memId;
	private String boTitle;
	private String boContent;
	private String boDate;
	
	public BoardVO(int boNo, String boTitle, String boContent, String boDate) {
		super();
		this.boNo = boNo;
		this.boTitle = boTitle;
		this.boContent = boContent;
		Date time = new Date();
		SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
		this.boDate = dataFormat.format(time);
//		this.boDate = boDate;
	}
	
	public BoardVO() {
		
	}

	@Override
	public String toString() {
		return "[" + boNo + ". | " + boTitle + " | " + memId + " | " + boDate + "]";
	}
	

	public int getBoNo() {
		return boNo;
	}

	public void setBoNo(int boNo) {
		this.boNo = boNo;
	}

	public String getBoTitle() {
		return boTitle;
	}

	public void setBoTitle(String boTitle) {
		this.boTitle = boTitle;
	}

	public String getBoContent() {
		return boContent;
	}

	public void setBoContent(String boContent) {
		this.boContent = boContent;
	}

	public String getBoDate() {
		return boDate;
	}

	public void setBoDate(String boDate) {
		this.boDate = boDate;
	}
	
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}
	
}
