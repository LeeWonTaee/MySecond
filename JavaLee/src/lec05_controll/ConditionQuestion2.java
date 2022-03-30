package lec05_controll;

import java.util.Scanner;

public class ConditionQuestion2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력해주세요. : ");
		int kor = sc.nextInt();
		System.out.print("수학점수를 입력해주세요. : ");
		int math = sc.nextInt();
		System.out.print("영어점수를 입력해주세요. : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		String grade;
		if (avg >= 90) {
			grade = "A";
		}else if(avg >= 80) {
			grade = "B";
		}else if(avg >= 70) {
			grade = "C";
		}else {
			grade = "D";
		}
		
		System.out.println("합계 : " + sum + "점\n평균 : " + avg + "(반올림 : " + Math.round(avg) + "점)" + "점\n등급 : " + grade);
		
		
		sc.close();
		
	}
}
