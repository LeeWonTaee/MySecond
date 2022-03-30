package submit.submit_0107;

public class Submit01 {
	public static void main(String[] args) {
		// 1번
		int intVal = 1;
		double douVal = 2.1;
		String strVal = "Hello";
		System.out.println("정수 : " + intVal);
		System.out.println("실수 : " + douVal);
		System.out.println("문자열 : " + strVal);
		
		// 2번
		intVal = 22;
		douVal = 3.14;
		strVal = "Bye";
		
		// 3번
		double intToDou = (double)intVal;
		System.out.println("정수에서 실수로 : " + intToDou);
		
		// 4번
		int douToInt = (int)douVal;
		System.out.println("실수에서 정수로 : " + douToInt);
		
		// 5번
		String intToStr = Integer.toString(intVal);
		System.out.println("정수에서 문자열로 : " + intToStr);
		
		// 6번
		int strToInt = Integer.parseInt(intToStr);
		System.out.println("문자열에서 정수로 : " + strToInt);
		
		// 7번
		int INTTYPE = 100;
		double DOUBLETYPE = 10.10;
		String STRINGTYPE = "안녕하세요";
		
		System.out.println("정수 타입의 상수 : " + INTTYPE);
		System.out.println("실수 타입의 상수 : " + DOUBLETYPE);
		System.out.println("문자열 타입의 상수 : " + STRINGTYPE);
	}
}
