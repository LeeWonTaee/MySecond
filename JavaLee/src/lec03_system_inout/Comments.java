package lec03_system_inout;

public class Comments {
	// 단일 주석
//	int intVal = 1; // 단일 주석 단축키는 Ctrl + /
//	int intVal2 = 2;
	
	/*
	 * 다중 주석
	 * 안녕하세요
	 * Hello World
	 */
	
	// 자바 문서(javadoc) 주석
	/**
	 * 가장 맛있는 과일은
	 */
	static String orange = "오렌지";
	
	public static void main(String[] args) {
		String banana = "바나나";
		// TODO 바나나를 콘솔에 출력해야함
		System.out.println(orange);
	}
	
	// TODO 주석
}
