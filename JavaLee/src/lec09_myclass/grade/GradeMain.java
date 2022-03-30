package lec09_myclass.grade;

import java.util.Scanner;

public class GradeMain {
	public static void main(String[] args) {
		String grade;
		int sum;
		double avg;
		GradeList gradeList = GradeList.getInstace();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생5명의 정보를 순서대로 입력해주세요.");
		int i = 0;
		while(i < 5) {
			
			System.out.print("이름을 입력해주세요 : ");
			String name = sc.nextLine();
			System.out.print("학번을 입력해주세요 : ");
			long hakbun = Integer.parseInt(sc.nextLine());
			System.out.print("중간점수를 입력해주세요 : ");
			int mid = Integer.parseInt(sc.nextLine());
			System.out.print("기말점수를 입력해주세요 : ");
			int fin = Integer.parseInt(sc.nextLine());
			System.out.print("과제점수를 입력해주세요 : ");
			int rep = Integer.parseInt(sc.nextLine());
			System.out.print("출석점수를 입력해주세요 : ");
			int att = Integer.parseInt(sc.nextLine());
			
			i++;
		}
		
	
	}
	
}
