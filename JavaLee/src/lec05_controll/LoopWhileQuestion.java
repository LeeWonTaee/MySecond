package lec05_controll;

public class LoopWhileQuestion {
	public static void main(String[] args) {
		// while문이랑 for문이랑 표현만 좀 다르지
		// 결국 같은 반복문이다.
		// for문 크리스마스트리를
//		star = "*";
//		String blank = "";
//		for(int i = 0; i < 5; i++) {
//			if(i > 0) {
//				star += "**";
//			}
//			blank = "";
//			for(int j= 1; j < 5-i; j++) {
//				blank += " ";
//			}
//			System.out.println(i + ": " + blank + star);
//		}
		
//		blank = "";
//		for(int i = 0; i < 5; i++) {
//			if ( i > 0 ) {
//				blank += " ";
//			}
//			star = "*";
//			for(int j = 0; j < 4-i; j++) {
//				star += "**";
//			}
//			System.out.println(i + ": " + blank + star);
//		}
		
		// while문으로 출력
		String star = "*";
		String blank = "";
		int i = 0;
		while(i < 5) {
			if(i > 0) {
				star += "**";
			}
			i++;
			blank = "";
			int j = 0;
			while(j < 5-i) {
				blank += " ";
				j++;
			}
			System.out.println(blank + star);
		}
		blank = "";
		int k = 1;
		while(k < 5) {
			if ( k > 0 ) {
				blank += " ";
			}
			k++;
			star = "*";
			int l = 0;
			while ( l < 5-k ) {
				star += "**";
				l++;
			}
			System.out.println(blank + star);
		}

		star = "*";
		blank = "";
		int i2 = 0;
		while(i2 < 5) {
			if(i2 > 0) {
				star += "**";
			}
			
			blank = "";
			int j2 = 0;
			while(j2 < 5-i2) {
				blank += " ";
				j2++;
			}
			i2++;
			System.out.println(blank + star);
		}
		
	}
}
