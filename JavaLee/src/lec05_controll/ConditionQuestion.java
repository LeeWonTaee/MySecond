package lec05_controll;

import java.util.Scanner;

public class ConditionQuestion {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름을 입력해주세요. >> ");
//		String name = sc.nextLine();
//		
//		System.out.print("연락처를 \"없이\" 입력해주세요. >> ");
//		String phone = sc.nextLine();
//		
//		System.out.print("나이를 입력해주세요. >> ");
//		String age = sc.nextLine();
//		
//		if((name.length() > 0) 
//				&& (phone.length() == 11 || phone.length() == 10) 
//				&& (Integer.parseInt(age) >= 14)) {
//			System.out.println("회원가입 버튼 활성화 ");
//			System.out.println(name + "님 환영합니다.");
//		}else {
//			System.out.println("회원가입 불가");
//		}
		
		
		// 사용자로부터 국어, 영어, 수학 점수를 각각
		// 입력받아 평균점수를 구하고 등급을 출력해주세요.
		// 평균점수가 90점 이상이면 A, 80점 이상 B,
		// 70점 이상은 C, 나머지는 D
		
		// 사용자로부터 입력받을 점수들
		// 점수들을 int로 변환하여 세 과목을 더하고 나누기 3
		// if문을 사용해서 등급을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력해주세요. : ");
		String kor = sc.nextLine();
		System.out.print("수학점수를 입력해주세요. : ");
		String math = sc.nextLine();
		System.out.print("영어점수를 입력해주세요. : ");
		String eng = sc.nextLine();
		
		int sum = Integer.parseInt(kor) + Integer.parseInt(math) + Integer.parseInt(eng);
		double avg = sum / 3.0;
		System.out.println("평균 : " + avg);
		
		int result = (int) Math.round(avg);
		System.out.println("반올림 한 값 : " + result);
		String grade;
		if (result >= 90) {
			grade = "A";
		}else if(result >= 80) {
			grade = "B";
		}else if(result >= 70) {
			grade = "C";
		}else {
			grade = "D";
		}
		
		System.out.println("등급 : " + grade);
		
		sc.close();
		
		
	}
}
