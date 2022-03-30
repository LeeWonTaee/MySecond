package lec07_array;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		System.out.println("\n============ 정렬 전 ============\n");
		for(int i = 0; i< intArr.length; i++) {
			if(i == intArr.length -1) {
				System.out.println(intArr[i]);
			}else {
				System.out.print(intArr[i] + ", ");				
			}
		}
		System.out.println("\n============ 정렬 ============\n");
		int max = intArr[0];
		for(int i = intArr.length - 1; i > 0 ; i--) {
			max = i;
			for(int j = 0; j <= i; j++) {
				if(intArr[j] > intArr[max]) {
					max = j;
				}
			}
			swap(intArr, max, i);
			System.out.print((i+1) + "회 실행 : ");
			printArray(intArr);
		}
		System.out.println("\n============ 정렬 후 ============\n");
		printArray(intArr);
		
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
