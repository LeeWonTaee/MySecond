package lec09_myclass.grade;

import java.util.ArrayList;

public class GradeList {
	
	private GradeList() {
		
	}
	
	private static GradeList instance = new GradeList();
	
	public static GradeList getInstace() {
		return instance;
	}
	
	private ArrayList<Grade> gradeList = new ArrayList<Grade>();
	
	public void addGrade(Grade grade) {
		gradeList.add(grade);
	}
	
	public void sumGrage() {
		for(int i = 0; i < gradeList.size(); i++) {
			System.out.println("학생" + gradeList.get(i).getName() + "의 총점은"
					+ (gradeList.get(i).getMid() 
					+ gradeList.get(i).getFin()
					+ gradeList.get(i).getAtt()
					+ gradeList.get(i).getRep()
					) + " 입니다. ");
			
		}
	}
	
	public void showList() {
		System.out.println("학생 목록 =======================");
		for(int i = 0; i < gradeList.size(); i++) {
			System.out.println(gradeList.get(i));
		}
		System.out.println("============================");
		
	}
	
}
