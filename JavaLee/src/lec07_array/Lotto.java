package lec07_array;

public class Lotto {
	public static void main(String[] args) {
		// 로또
		// Math.random() : 0부터 1사이에 랜덤 실수를 생성해주는 함수
		// 0 ~ 0.999...
		// 로또는 1부터 45까지 6자리의 숫자 배열
		
		// Math.random() * 10 을 하면 0 ~ 9.99 (int 0~9)
		// Math.random() * 100 을 하면 0 ~ 99.99 (int 0~99)
		// Math.random() * 45 을 하면 0 ~ 44.99 (int 0 ~ 44)
		
		// myLotto 에 Math.random()을 이용해서
		// 로또 번호(1~45)를 중복되지 않게 담아주세요
		
//		int lottoNum = (int)(Math.random() * 45 + 1);
//		System.out.println(lottoNum);
//		
//		int[] myLotto = new int[6];
//		for(int i = 0; i < myLotto.length-1; i++) {
//			myLotto[i] = (int)(Math.random() * 45 + 1);
//			if(myLotto[i] != myLotto[i+1]) { 
//				if(i == myLotto.length -1) {
//					System.out.println(myLotto[i]);
//				}else {
//					System.out.print(myLotto[i] + ", ");	
//				}
//			}
//		}
//		System.out.println("");
//		for(int i = 0; i < myLotto.length; i++) {
//			myLotto[i] = (int)(Math.random() * 45 + 1);
//			for(int j = 0; j < i; j++) {
//				if(myLotto[i] == myLotto[j]) {
//					i--;
//				}
//			}
//		}
//		ArrayStudy.printArray(myLotto);
//		System.out.println("");
		
		int[] winLotto = {1, 4, 29, 39, 43, 45};
		int[] lottoArr = makeLotto();
		
		ArrayStudy.printArray(winLotto);
		ArrayStudy.printArray(lottoArr);
		
		// winLotto와 lottoArr을 비교해서
		// 당첨 갯수를 리턴하는 함수를 만들어주세요.
		
		System.out.println(compareLotto(winLotto, lottoArr));
		
		long runTime = 0;
		while(true) {
			System.out.println(++runTime + "회 실행");
			if(compareLotto(winLotto, makeLotto())) {
				System.out.println("1등 당첨");
				System.out.println("구매 횟수" + runTime);
				System.out.println("구매 금액 : " + (runTime * 1000));
				break;
			}
			
		}
		
	} // main 끝
	
//	public static int compareLotto(int[] winArr, int[] myArr) {
//		int count = 0;
//		for(int i = 0; i < winArr.length; i++) {
//			for(int j = 0; j < myArr.length; j++) {
//				if(winArr[i] == myArr[j]) {
//					count++;
//				}
//			}
//		}
//		if(count == 6) {
//			System.out.println("맞춘 개수 : " + count + "개, 1등 입니다. ");
//		}else if(count == 5) {
//			System.out.println("맞춘 개수 : " + count + "개, 2등 입니다. ");
//		}else if(count == 4) {
//			System.out.println("맞춘 개수 : " + count + "개, 3등 입니다. ");
//		}else if(count == 3) {
//			System.out.println("맞춘 개수 : " + count + "개, 4등 입니다. ");
//		}else if(count == 2) {
//			System.out.println("맞춘 개수 : " + count + "개, 5등 입니다. ");
//		}else {
//			System.out.println("맞춘 개수 : " + count + "개, 낙첨입니다.");
//		}
//		return count;
//	}
	public static boolean compareLotto(int[] winArr, int[] myArr) {
		int count = 0;
		for(int i = 0; i < winArr.length; i++) {
			for(int j = 0; j < myArr.length; j++) {
				if(winArr[i] == myArr[j]) {
					count += 1;
				}
			}
//			if(count == 6) {
//				return true;
//			}
//			return false;
			System.out.println(count + "개 일치");
			return (count == 6);
		}
		return false;
	}
	
	// 유용한 단축키
	// [Alt + Shift + R] 변수의 이름을 바꿀때,
	// 변수가 사용되고 있는 부분들까지 한번에 바꿀 수 있다.
	// 로또 만들어서 숫자 배열 리턴
	public static int[] makeLotto() {
		int[] myLotto = new int[6];
		int idx = 0;
		while(true) {
			int lotto = (int)(Math.random()*45 + 1);
			boolean isEqual = false;
			
			// 중복체크
			for(int i = 0; i < idx; i++) {
				if(lotto == myLotto[i]) {
					isEqual = true;
				}
			}
			if(isEqual == false) {
				myLotto[idx] = lotto;
				idx++;
				if(idx > 5) {
					break;
				}
			}
		}
//		ArrayStudy.printArray(myLotto);
		// 로또는 정렬도 해야함 (오름차순)
		for(int i = 0; i < myLotto.length; i++) {
			boolean swapped = false;
			for(int j = 0; j < myLotto.length -1 - i; j++) {
				if(myLotto[j] > myLotto[j+1]) {
					// myLotto의 j와 j+1 자리 바꾸기
					myLotto[j] = myLotto[j] + myLotto[j+1];
					myLotto[j+1] = myLotto[j] - myLotto[j+1];
					myLotto[j] = myLotto[j] - myLotto[j+1];
					swapped = true;
				}
			}
			if(swapped != true) { // swapped == false
				break;
			}
		}
//		ArrayStudy.printArray(myLotto);
		return myLotto;
	}
	

	
}
