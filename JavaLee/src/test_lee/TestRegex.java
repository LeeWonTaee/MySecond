package test_lee;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestRegex {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			String test = sc.nextLine();
			String regex = "[^a-d 1-7]";
			
			// inputText가 숫자로 이루어진 문자열이면 isNum은 true
			boolean boolTest = Pattern.matches(regex, test);
			if(!boolTest) {
				System.out.println("실패");
			} else {
				System.out.println("성공");
				break;
			}			
		}

	}
}
