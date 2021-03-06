package lec09_class.typing;

import java.util.Scanner;

public class TypingMain {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		
		Scanner sc = new Scanner(System.in);
		
		long pastTime = System.currentTimeMillis();
		
		while(dictionary.countWords() > 0) {
			dictionary.showWords();
			System.out.print("입력: ");
			String inputText = sc.nextLine();
			
			dictionary.removeWord(inputText);
		}
		
		long currentTime = System.currentTimeMillis();
		
		long diffTime = currentTime - pastTime;
		double result = diffTime / 1000.0;
		
		System.out.println(result + "초 걸리셨습니다.");
		
	}
}
