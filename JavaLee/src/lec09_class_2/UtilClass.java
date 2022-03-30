package lec09_class_2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 유용한 함수들을 제공하는 클래스
 */
public class UtilClass {
	
	public static String owner = "만든이: 정찬웅";
	
	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수
	 * @param douNum 반올림 하고 싶은 실수
	 * @param n 반올림 하고 싶은 자리
	 * @return 반올림된 실수
	 */
	public static double round(double douNum, int n) {
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}
		double mul = douNum * one;
		long longNum = Math.round(mul);
		double douVal = (double)longNum / one;
		
		return douVal;
	}
	/**
	 * 유니크한 아이디 만들어주는 메소드 
	 */
	public static String makeUniqueId() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Date date = new Date();
		String uniqueId = sdf.format(date);
		
		for(int i = 0; i < 6; i++) {
			int randInt = (int)(Math.random()*10);
			uniqueId += randInt;
		}
		
		return uniqueId;		
	}
}
