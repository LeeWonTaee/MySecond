package lec02_variable_type;

public class VariableQuestion {
	public static void main(String[] args) {
		
		String enigma = "너오구늘리뭐너먹구지리";
		
		// 1. 너, 구, 리 를 제거해서 출력
		// .replace
		String enigma1 = enigma.replace("너", "");
		String enigma2 = enigma1.replace("구", "");
		String enigma3 = enigma2.replace("리", "");
		System.out.println(enigma3);
		
		// 2. 한줄로 처리해서 출력
		System.out.println(enigma.replace("너", "").replace("구", "").replace("리", ""));
		System.out.println(enigma.replaceAll("[너구리]", ""));
		
		// 1. 풀이
		String tryOne = enigma.replace("너", "");
		System.out.println("1차 암호 해독[\"너\" 제거]: " + tryOne);
		String tryTwo = tryOne.replace("구", "");
		System.out.println("2차 암호 해독[\"구\" 제거]: " + tryTwo);
		String tryThree = tryTwo.replace("리", "");
		System.out.println("3차 암호 해독[\"리\" 제거]: " + tryThree);
		
		// 2. 풀이
		enigma = enigma.replace("너", "")
				.replace("구", "")
				.replace("리", "");
		System.out.println(enigma);
	}

}
