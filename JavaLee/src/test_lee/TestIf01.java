package test_lee;

import java.util.Scanner;

public class TestIf01 {
	public static void main(String[] args) {
		// 연도를 입력받아 윤년 구하기
		System.out.print("연도를 입력해주세요.(1~4000) : ");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if(year < 0 || year > 4000) {
			System.out.println("1부터 4000까지의 숫자만 입력해주세요.");
		}else {
			if(year % 4 == 0 && year % 100 != 0) {
				System.out.println("윤년입니다.");
			}else if(year % 400 == 0) {
				System.out.println("윤년입니다.");
			}else {
				System.out.println("윤년이 아닙니다.");
			}
		}
		scanner.close();
	}
}
