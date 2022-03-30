package lec07_array;

public class ArrayTest3 {
	public static void main(String[] args) {
		// 강사님 풀이
		int[] intArray = {23, 456, 213, 32, 464, 1, 2, 4};
		for(int i = 0; i< intArray.length - 1; i++) {
			// 최댓값 구하기
			int maxValue = intArray[0];
			int maxIdx = 0;
			for(int j = 1; j < intArray.length - i; j++) {
				if(maxValue < intArray[j]) {
					maxValue = intArray[j];
					maxIdx = j;
				}
			}
			// swap, 최대값인 maxValue의 인덱스와
			// 바꿀자리인 인덱스 자리
			swap(intArray, maxIdx, intArray.length-1-i);
		}
		System.out.println(intArray); //해쉬 코드값
		ArrayStudy.printArray(intArray); //클래스가 private로 선언되어있으면 이렇게 사용 불가, public일때만 가능한데, 아무것도 안쓴 디폴트 값이여도 가능
		
		// 내림차순
		for(int i = 0; i < intArray.length -1; i++) {
			// 최대값 구하기
			int maxVar = intArray[intArray.length-1];
			int maxIdex = intArray.length-1;
			for(int j = i; j < intArray.length-1; j++) {
				if(maxVar < intArray[j]) {
					maxVar = intArray[j];
					maxIdex = j;
				}
			}
			// swap
			swap(intArray, maxIdex, i);
		}
		ArrayStudy.printArray(intArray);
	}
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
