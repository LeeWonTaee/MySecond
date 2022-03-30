package lec05_controll;

import java.util.Scanner;

public class LoopfinalTest {
	public static void main(String[] args) {
		// 복습
		
		// 팩토리얼
		// 수학기호로 4!는 4팩토리얼을 의미하며,
		// 4X3X2X1 = 24
		
		// for문을 사용해서 10팩토리얼의 값을 출력
		// @ 15팩토리얼의 값도 출력
		int sum = 1;
		for (int i = 1; i <= 10; i++) {
			sum *= i;
			
		}
		System.out.println("10! = " +sum);
		
		long res = 1;
		for (int i = 1; i <= 15; i++) {
			res *= i;
		}
		System.out.println("15! = " +res);
		
		System.out.println("\n================= 룰렛 이벤트 ===============\n");
		// 룰렛을 힘차게 돌렸더니
		// 5834도가 돌아갔다고 합니다.
		// 한바퀴는 360도
		
		// 룰렛이 멈추고난 각도에 따른 경품이 
		// 뭔지 출력을 해주시고, 총 몇 바퀴 돌아갔는지도 출력 해주세요
		// 0도 초과 ~ 60도 이하 : 사탕
		// 60도 초과 ~ 120도 이하 : 초콜릿
		// 120도 초과 ~ 180도 이하 : 쿠키
		// 180도 초과 ~ 240도 이하 : 콜라
		// 240도 초과 ~ 300도 이하 : 아이스크림
		// 300도 초과 ~ 360(0)도 이하 : 커피
		
		System.out.println("\nif");
		int rul1 = 5834 / 360;
		int rul2 = 5834 % 360;
		String a;
		if(rul2 > 0 && rul2 <= 60) {
			a = "사탕";
		}else if(rul2 > 60 && rul2 <= 120) {
			a = "초콜릿";
		}else if(rul2 > 120 && rul2 <= 180) {
			a = "쿠키";
		}else if(rul2 > 180 && rul2 <= 240) {
			a = "콜라";
		}else if(rul2 > 240 && rul2 <= 300) {
			a = "아이스크림";
		}else {
			a = "커피";
		}
		System.out.println(rul1 + "바퀴");
		System.out.println(rul2 + "도, 경품 : " + a);
		
		System.out.println("\n================ 로꾸꺼 ===============\n");
		
		// 사용자가 입력한 문자열의 순서를 뒤집어서 출력
		/* charAt */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("거꾸로 뒤집을 문자열 입력 >>");
//		String inputText = sc.nextLine();
//		for(int i = inputText.length()-1; i >= 0; i--) {
//			System.out.println(inPutText.charAt(i));  
//		}
		
		/* substring */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("거꾸로 뒤집을 문자열 입력 >>");
//		String inputText = sc.nextLine();
//		String outPutText = "";
//		for(int i = inputText.length()-1; i >= 0; i--) {
//			outPutText += inputText.substring(i, i+1);
//		}
//		System.out.println(outPutText);
		
		/* 강사님 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("거꾸로 뒤집을 문자열 입력 >>");
//		String inputText = sc.nextLine();
//		String outPutText = "";
//		for(int i = inputText.length(); i > 0; i--) {
//			outPutText += inputText.substring(i-1, i);
//		}
//		System.out.println(outPutText);
//		
//		sc.close();
		// 코드 정렬 단축키 [Ctrl + Shift + F]
		
		System.out.println("\n================== 2월 달력 =================\n");
		// 2월 달력을 출력
		// 화요일에 1일 스타트
		// startDay는 요일을 기준으로
		// 일요일 0, 월요일 1, 화 2, 수 3, 목 4, 금 5, 토 6
		
		int startDay = 2;
		int lastDay = 28;
		int currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 0; i <= 42; i++) {
			if(i >= startDay) {
				System.out.print(currentDay + "\t");
				currentDay++;
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			// i가 6, 13, 20, 27인 경우 줄바꿈
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		System.out.println("\n================ 6월 달력 ==============\n");
		
		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 0; i < 42; i++) {
			if(i >= startDay) {
				System.out.print(currentDay + "\t");
				currentDay++;
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		
		
		System.out.println("\n================ 6월 달력 (10일부터 날짜가 오른쪽으로) ==============\n");
		
		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 0; i < 42; i++) {
			if(i >= startDay) {
				System.out.print(currentDay + "\t");
				currentDay++;
				if(currentDay > 9) {
					System.out.print(" ");
					if(currentDay > lastDay) {
						break;
					}
				}
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		System.out.println("\n================ 6월 달력 (10일 전까지) ==============\n");
		
		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 0; i < 42; i++) {
			if(i >= startDay) {
				if(currentDay < 10) {
					System.out.print(" ");
				}
				System.out.print(currentDay + "\t");
				currentDay++;
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		
		
	}
}
