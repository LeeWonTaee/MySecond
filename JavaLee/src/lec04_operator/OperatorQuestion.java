package lec04_operator;


public class OperatorQuestion {
	public static void main(String[] args) {
		// 삼항연산자를 이용해서
		// 아래의 주민번호 뒷자리의 첫번째 숫자에 따른 성별을 
		// 받는 gender 변수에 담아 콘솔에 출력하시오.
		// 항상 주민번호 뒷자리 첫번째 숫자가 홀수면 남성, 짝수면 여성
		String hisIdBack = "1231476";
		String herIdBack = "4254654";
		
		int hisFirst = Integer.parseInt(hisIdBack.substring(0,1));
		int herFirst = Integer.parseInt(herIdBack.substring(0,1));
		
		String hisGender = (hisFirst % 2 == 1) ? "남자입니다." : "여자입니다.";
		String herGender = (herFirst % 2 == 1) ? "남자입니다." : "여자입니다.";
		System.out.println(hisGender);
		System.out.println(herGender);
		
		
		
	}

}
