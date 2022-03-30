package lec07_array;

public class ArrayQuestion {
	public static void main(String[] args) {
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		
		// intArr의 최댓값을 출력해주세요.
		// for문을 이용
		int max = intArr[0]; // 배열의 길이가 1일경우에 대비
		for(int i = 1; i < intArr.length; i++) {
			if (intArr[i] > max) {
				max = intArr[i];
			}
		}
		System.out.println("최대값 : " + max);
		
		int min = intArr[0]; // 배열의 길이가 1일경우에 대비
		for(int i = 1; i < intArr.length; i++) {
			if (intArr[i] < min) {
				min = intArr[i];
			}
		}
		System.out.println("최소값 : " + min);
		
		// 배열내 요소 자리 바꾸는 함수
		
		System.out.println("\n===================================\n");
		// 선택정렬
		// 1. 해당 배열에서 최댓값을 찾아 해당 위치의 값과 
		// 배열의 마지막 값을 swap한다.
		// 2. 배열의 마지막을 제외한 나머지 값들 중
		// 최댓값을 찾아서 해당 위치의 값과 배열의 끝에서 두번째 
		// 값을 swap한다.
		// 3. 위 과정을 반복하면 정렬이 된다.
		// @. 최대값을 이용해서 내림차순을 해보세요.
		// 매번 최댓값을 찾아서, 맨 앞에서부터 바꿔가면 된다.
		System.out.println("\n========== 정렬전 ===========\n");
		for(int i = 0; i< intArr.length; i++) {
			if(i == intArr.length -1) {
				System.out.println(intArr[i]);
			}else {
				System.out.print(intArr[i] + ", ");				
			}
		}
//		System.out.println("\n========== 정렬후 ===========\n");
//		max = intArr[0];
//		for(int i = 0; i < intArr.length; i++) {
//			for(int j = 1; j < intArr.length-1-i; j++) {
//				if (intArr[j] > max) {
//					max = intArr[j];
//					intArr[j] = intArr[j+intArr.length-1];
//					intArr[j+intArr.length-1] = max;
//				}
//			}
//		}
//		printArray(intArr);
	} // main 끝
	/**
	 * 해당 intArray의 인덱스 idxA와 idxB의 값을 교환한다.
	 * @param intArray 값을 교환할 숫자 배열
	 * @param idxA 값을 교환할 인덱스 첫번째
	 * @param idxB 값을 교환할 인덱스 두번째
	 */
	public static void swap(int[] intArray, int idxA, int idxB) {
		int temp = intArray[idxA];
		intArray[idxA] = intArray[idxB];
		intArray[idxB] = temp;
	}
	
	public static void printArray(String[] strArray) {
		for(int i = 0; i < strArray.length; i++) {
		
			if(i == strArray.length -1) {
				System.out.println(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");				
			}
		}	
	}
	
	public static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
		
			if(i == intArray.length -1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");				
			}
		}	
	}
	
	
	
	
	
	
	
}
