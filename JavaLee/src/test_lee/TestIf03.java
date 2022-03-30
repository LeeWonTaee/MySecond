package test_lee;

import java.util.Scanner;

public class TestIf03 {
	public static void main(String[] args) {
		// 점수를 입력받아 합계, 평균, 학점 구하기
		System.out.println("중간, 기말, 과제, 출석순으로 점수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int mid = scanner.nextInt();
		int fin = scanner.nextInt();
		int rep = scanner.nextInt();
		int att = scanner.nextInt();
		
		int sum = mid + fin + rep + att;
		double avg = sum/4;
		String grade;
		if (avg >= 95) {
			grade = "A+";
		} else if (avg >= 90) {
			grade = "A0";
		} else if (avg >= 85) {
			grade = "B+";
		} else if (avg >= 80) {
			grade = "B0";
		} else if (avg >= 75) {
			grade = "C+";
		} else if (avg >= 70) {
			grade = "C0";
		} else if (avg >= 65) {
			grade = "D+";
		} else if (avg >= 60) {
			grade = "D0";
		} else {
			grade = "F";
		}
		
		System.out.println("중간 : " + mid + "점, 기말 : " + fin + "점, 과제 : " + rep + "점, 출석 : " + att + "점 입니다.");
		System.out.println("점수 합계는 " + sum + "이며, 평균은 " + avg + "이므로 학점은 " + grade + "입니다.");
		
		scanner.close();
	}
}
