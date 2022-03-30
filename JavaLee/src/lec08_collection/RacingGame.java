//package lec08_collection;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class RacingGame {
//	
//	static ArrayList<Team> teamList = new ArrayList<Team>();
//	public static void main(String[] args) {
//		// 경마 게임
//		
//		teamList.add(new Team("1팀", 100, 0, 0));
//		teamList.add(new Team("2팀", 100, 0, 0));
//		teamList.add(new Team("3팀", 100, 0, 0));
//		teamList.add(new Team("4팀", 100, 0, 0));
//		
//		Scanner scanner = new Scanner(System.in);
//		for(int i = 0; i < 5; i++) {
//			String lane1 = "1. ";
//			String lane2 = "2. ";
//			String lane3 = "3. ";
//			String lane4 = "4. ";
//			
//			System.out.println();
//			
//			for(Team t : teamList) {
//				System.out.println((t.name + " 몇 레인에 베팅하겠습니까? : "));
//				int lane = Integer.parseInt(sc.nextLine());
//				t.lane = lane;
//				
//				System.out.println("베팅 금액을 입력해주세요"
//						+ "(소지금: " + t.money + ")");
//			}
//			
//			while(true) {
//				int random = (int)(Math.random() * 8); // 0~7
//				
//				// 8분의 1확률로 한칸 전진
//				if(random == 1) {
//					lane1 += "=";
//				}else if(random == 2) {
//					lane2 += "=";
//				}else if(random == 3) {
//					lane3 += "=";
//				}else if(random == 4) {
//					lane4 += "=";
//				}
//				
//				for(int j = 0; j < 20; j++) {
//					System.out.println();
//				}
//				
//				System.out.println(lane1);
//				System.out.println(lane2);
//				System.out.println(lane3);
//				System.out.println(lane4);
//				
//				if(lane1.length() == 40) {
//					System.out.println("첫 번째 말 승리");
//					betResult(1);
//					break;
//				}
//				
//				if(lane2.length() == 40) {
//					System.out.println("두 번째 말 승리");
//					betResult(2);
//					break;
//				}
//				
//				if(lane3.length() == 40) {
//					System.out.println("세 번째 말 승리");
//					betResult(3);
//					break;
//				}
//				
//				if(lane4.length() == 40) {
//					System.out.println("네 번째 말 승리");
//					betResult(4);
//					break;
//				}
//				
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				
//			}
//		}
//		
//	}
//	static void betResult(int lane) {
//		for(Team t : teamList) {
//			if(t.lane == 1) {
//				System.out.println(t.team + " " + (t.bet*4)
//						+ " 점 획득");
//				t.money += t.bet*4;
//			}
//		}
//	}
//	
//}
