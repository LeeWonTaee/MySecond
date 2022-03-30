package test_lee;

import java.util.Scanner;

public class TestFor04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("거꾸로 뒤집을 문자열 입력 >>");
		String inputText = sc.nextLine();
		String outPutText = "";
		for(int i = inputText.length(); i > 0; i--) {
			outPutText += inputText.substring(i-1, i);
		}
		System.out.println(outPutText);
		
		sc.close();
	}
}
