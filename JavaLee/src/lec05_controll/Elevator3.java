package lec05_controll;

import java.util.Scanner;

public class Elevator3 {
	public static void main(String[] args) {
		// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 
		// 눌렀을때, 한 대의 엘리베이터가 이동하는 프로그램 구현
		
		// 1. 사용자의 현재 위치를 Scanner로 입력하면 
		//    사용자의 위치와 더 가까운 엘리베이터가 이동한다.
		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면
		//	  둘 중 위 층의 엘리베이터가 내려온다.
		// 3. 사용자가 입력한 위치로 엘리베이터의 위치를 바꿔준다.
		// 4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit을 입력
		
		// 너무 쉽다면 
		// @. 사용자가 엘리베이터에 탑승하고 층을 입력하면, 
		// 	  탑승 중인 엘리베이터가 해당 층으로 이동하도록 만들어보기
		// @. 사용자가 숫자가 아닌 다른 값을 입력했을때,
		// 	  "잘못 입력하셨습니다." 출력 후 다시 입력할 수 있게 만들기
		
		int elevatorA = 10; // 엘리베이터 A의 위치
		int elevatorB = 4; // 엘리베이터 B의 위치
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n============== 희영빌딩 엘리베이터 ==============\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA + "층");
			System.out.println("승강기 B의 현재 위치: " + elevatorB + "층");
			
			System.out.print("몇층에 계시나요?[종료하려면 q 또는 exit 입력] : ");
			
			
			
			String ele = sc.nextLine();
			if(ele.toUpperCase().equals("Q") || ele.toUpperCase().equals("EXIT")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else {
				int el = Integer.parseInt(ele);
				if(el > 10 || el < 0) {
					System.out.println("잘못 입력하셨습니다.");
				} else {
					if((el - elevatorA) > (elevatorB - el)) {
						System.out.println(el + "층에서 엘리베이터를 호출 합니다.");
						System.out.println("승강기 A가" + el +"층 으로 이동하였습니다." );
						elevatorA = el;
						System.out.print("어느 층으로 이동하시겠습니까? >> ");
						String ele2 = sc.nextLine();
						int el2 = Integer.parseInt(ele2);
						System.out.println(el2 + "층으로 이동하셨습니다.");
						elevatorA = el2;
						System.out.println("현재 당신의 위치는" + el2 +"층 입니다. 엘리베이터를 탑승하시겠습니까?[1. 예 | 2. 아니오]");
						String a = sc.nextLine();
						if(a.equals("1")) {
							System.out.print("몇층으로 이동 하시겠습니까? 현재 위치는" + el2 + "층 입니다. >>");
							String ele3 = sc.nextLine();
							int el3 = Integer.parseInt(ele3);
							System.out.println(el3 + "층으로 이동하셨습니다.");
							elevatorA = el3;
						} else if(a.equals("2")) {
							System.out.println("프로그램을 종료하였습니다.");
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
							break;
						}
					} else if((el - elevatorA) < (elevatorB - el)) {
						System.out.println(el + "층에서 엘리베이터를 호출 합니다.");
						System.out.println("승강기 B가" + el +"층 으로 이동하였습니다." );
						elevatorB = el;
						System.out.print("어느 층으로 이동하시겠습니까? >> ");
						String ele2 = sc.nextLine();
						int el2 = Integer.parseInt(ele2);
						System.out.println(el2 + "층으로 이동하셨습니다.");
						elevatorB = el2;
						System.out.println("현재 당신의 위치는" + el2 +"층 입니다. 엘리베이터를 탑승하시겠습니까?[1. 예 | 2. 아니오]");
						String a = sc.nextLine();
						if(a.equals("1")) {
							System.out.print("몇층으로 이동 하시겠습니까? 현재 위치는" + el2 + "층 입니다. >>");
							String ele3 = sc.nextLine();
							int el3 = Integer.parseInt(ele3);
							System.out.println(el3 + "층으로 이동하셨습니다.");
							elevatorB = el3;
						} else if(a.equals("2")) {
							System.out.println("프로그램을 종료하였습니다.");
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
							break;
						}
					} else if((el - elevatorA) == (elevatorB - el)) {
						if(elevatorA > elevatorB) {
							System.out.println(el + "층에서 엘리베이터를 호출 합니다.");
							System.out.println("승강기 A가" + el +"층 으로 이동하였습니다." );
							elevatorA = el;
							System.out.print("어느 층으로 이동하시겠습니까? >> ");
							String ele2 = sc.nextLine();
							int el2 = Integer.parseInt(ele2);
							System.out.println(el2 + "층으로 이동하셨습니다.");
							elevatorA = el2;
							System.out.println("현재 당신의 위치는" + el2 +"층 입니다. 엘리베이터를 탑승하시겠습니까?[1. 예 | 2. 아니오]");
							String a = sc.nextLine();
							if(a.equals("1")) {
								System.out.print("몇층으로 이동 하시겠습니까? 현재 위치는" + el2 + "층 입니다. >>");
								String ele3 = sc.nextLine();
								int el3 = Integer.parseInt(ele3);
								System.out.println(el3 + "층으로 이동하셨습니다.");
								elevatorA = el3;
							} else if(a.equals("2")) {
								System.out.println("프로그램을 종료하였습니다.");
								break;
							} else {
								System.out.println("잘못 입력하셨습니다.");
								break;
							}
						} else if (elevatorA > elevatorB) {
							System.out.println(el + "층에서 엘리베이터를 호출 합니다.");
							System.out.println("승강기 B가" + el +"층 으로 이동하였습니다." );
							elevatorB = el;
							System.out.print("어느 층으로 이동하시겠습니까? >> ");
							String ele2 = sc.nextLine();
							int el2 = Integer.parseInt(ele2);
							System.out.println(el2 + "층으로 이동하셨습니다.");
							elevatorB = el2;
							System.out.println("현재 당신의 위치는" + el2 +"층 입니다. 엘리베이터를 탑승하시겠습니까?[1. 예 | 2. 아니오]");
							String a = sc.nextLine();
							if(a.equals("1")) {
								System.out.print("몇층으로 이동 하시겠습니까? 현재 위치는" + el2 + "층 입니다. >>");
								String ele3 = sc.nextLine();
								int el3 = Integer.parseInt(ele3);
								System.out.println(el3 + "층으로 이동하셨습니다.");
								elevatorA = el3;
							} else if(a.equals("2")) {
								System.out.println("프로그램을 종료하였습니다.");
								break;
							} else {
								System.out.println("잘못 입력하셨습니다.");
								break;
							}
						} else {
							System.out.println("잘못 입력하셨습니다.");
							break;
						}
					} else {
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
				}
			}
			
		}
		sc.close();
	}
}
