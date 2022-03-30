package test_lee;

import java.util.Scanner;

public class TestIf02 {
	public static void main(String[] args) {
		// if문을 이용해 성인인지 미성년자인지 구분 
		int age = 21;
		
		if (age >= 20) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}
		
		
		// 나이를 입력받아 구분
		System.out.print("나이를 입력해주세요. : ");
		Scanner scanner = new Scanner(System.in);
		int age2 = scanner.nextInt();
		
		if (age2 < 0 || age2 > 150) {
			System.out.println("나이를 정확하게 입력해주세요.");
		} else {
			if (age2 >= 20) {
				System.out.println("성인입니다.");
			} else {
				System.out.println("미성년자 입니다.");
			}
		}
		
		scanner.close();
	}

}
