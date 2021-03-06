package lec05_controll;

public class LoopForQuestion {
	public static void main(String[] args) {
		// 거꾸로 트리를 5층
		
		String star = "*****";
		for(int i = 5; i > 0; i--) {
			String subStar = star.substring(0, i);
			System.out.println(subStar);
		}
		
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		// 거꾸로 구구단
		
		for(int i = 9; i > 1; i--) {
			System.out.println("2 X " + i + " = " + (2*i));
		}
		
		// 월리를 찾아라
		String findWally = "윌리울리일리울리울리일리월리";
		System.out.println(findWally.length());
		// 월리가 몇개 들어있는지 콘솔에 출력
		int cntNum = 0;
		for(int i = 0; i < findWally.length()-1; i++) {
			// i는 0부터 12까지 증가한다.
			String strNum = findWally.substring(i, i+2);
			// errMsg : String index out of range
			// substring 함수를 사용시 잘라낼 변수의 길이가 
			// 벗어난 경우
			if(strNum.equals("월리")) {
				cntNum += 1;
			}
		}
		System.out.println("월리는 총 " +cntNum);
		
		
		System.out.println("\n==================================\n");
		
		// 5층 크리스마스 트리
		star = "*";
		String blank = "";
		for(int i = 0; i < 5; i++) {
			if(i > 0) {
				star += "**";
			}
			blank = "";
			for(int j= 1; j < 5-i; j++) {
				blank += " ";
			}
			System.out.println(i + ": " + blank + star);
		}
		
		System.out.println("\n==================================\n");
		
		// 5층 거꾸로 트리
		blank = "";
		for(int i = 0; i < 5; i++) {
			if ( i > 0 ) {
				blank += " ";
			}
			star = "*";
			for(int j = 0; j < 4-i; j++) {
				star += "**";
			}
			System.out.println(i + ": " + blank + star);
		}
		
		
		
		
		
		
		
//		for(int i = 2; i < 10; i++) {
//			System.out.println(i + "단");
//			for(int j = 1; j < 10; j++) {
//				System.out.println(i + " X " + j + " = " + (i*j));
//			}
//		}
	}
}
