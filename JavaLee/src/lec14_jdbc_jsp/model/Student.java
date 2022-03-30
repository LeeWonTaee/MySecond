package lec14_jdbc_jsp.model;

public class Student {
	// 테이블 x, 각각의 줄에 있는 데이터
	// 카멜 표기법
	private int stuId;
	private String stuName;
	private int stuScore;
	
	public Student(int stuId, String stuName, int stuScore) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuScore = stuScore;
	}
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuScore=" + stuScore + "]";
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuScore() {
		return stuScore;
	}

	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
	
	
}
