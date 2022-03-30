package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.sun.corba.se.spi.ior.MakeImmutable;

import lec09_class.UtilClass;

public class ApiQuestion {
	public static void main(String[] args) throws ParseException {
		// 다양한 날짜 포멧 적용
		// 시계방에 놀러갔더니 다양한 디지털 시계들이 있다.
		// 1. 2022/03/17 14:17:20
		// 2. 2022-03-17 오후 02:17:20
		// 3. 2022.03.17 PM 02:17:20
		// 4. 목 오후 02:17:20
		// 5. 목요일 14:17:20
		// 6. Thu PM 02:17:20
		// 의 디지털 시계 만들기
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String strDay = sdf.format(date);
		System.out.println("1. "+ strDay);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		date = new Date();
		strDay = sdf.format(date);
		System.out.println("2. "+ strDay);
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.US);
		date = new Date();
		strDay = sdf.format(date);
		System.out.println("3. "+ strDay);
		
		sdf = new SimpleDateFormat("E a hh:mm:ss");
		date = new Date();
		strDay = sdf.format(date);
		System.out.println("4. "+ strDay);
		
		sdf = new SimpleDateFormat("E요일 HH:mm:ss");
		date = new Date();
		strDay = sdf.format(date);
		System.out.println("5. "+ strDay);
		
		sdf = new SimpleDateFormat("E a hh:mm:ss", Locale.US);
		date = new Date();
		strDay = sdf.format(date);
		System.out.println("6. "+ strDay);
		
		// 현재 미국 날짜는?
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd E a HH:mm:ss", Locale.US);
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf2.setTimeZone(timeZone);
		strDay = sdf2.format(date);
		System.out.println("1. "+ strDay);
		
		
		System.out.println("\n======================================\n");
		
		// 디데이 계산기
		// 파라미터로 날짜를 입력받으면(String, yyyy.MM.dd 포맷)
		// 오늘날짜와 해당 날짜의 차이를 비교하여 
		// 차이 리턴(10일 남았으면 10, 10일 지났으면 -10)
		// 2022.04.01 개원기념일 몇일 남았는지
		// 2022.02.14 처음 온 날 부터 몇일 지났는지
		/* 1 */
//		SimpleDateFormat sdfToday = new SimpleDateFormat("yyyy.MM.dd");
//		Date todayDate = new Date();
//		String todayD = sdfToday.format(todayDate);
//		System.out.println("오늘 날짜 : " + todayD);
		

//		SimpleDateFormat sdfNext = new SimpleDateFormat("yyyy.MM.dd");
//		Calendar NextCal = Calendar.getInstance();
//		NextCal.set(2022, 3, 1);
//		String printNext = sdfNext.format(NextCal.getTime());
//		System.out.println("개원 기념일 : " + printNext);
//		Date nextDate = NextCal.getTime();
//		
//		long nextSum = nextDate.getTime() - todayDate.getTime();
//		long nextRes = nextSum / (1000 * 60 * 60 * 24);
//		System.out.println(nextRes);
//		
//		
//		SimpleDateFormat sdfStart = new SimpleDateFormat("yyyy.MM.dd");
//		Calendar StartCal = Calendar.getInstance();
//		StartCal.set(2022, 1, 14);
//		String printStart = sdfStart.format(StartCal.getTime());
//		System.out.println("처음 온 날 : " + printStart);
//		Date startDate = StartCal.getTime();
//		
//		
//		long startSum = startDate.getTime() - todayDate.getTime();
//		long startRes = startSum / (1000 * 60 * 60 * 24);
//		System.out.println(startRes);
		/* 2 */
//		SimpleDateFormat sdfToday = new SimpleDateFormat("yyyy.MM.dd");
//		Date todayDate = new Date();
//		String todayD = sdfToday.format(todayDate);
//		System.out.println("오늘 날짜 : " + todayD);
//		
//		String nextStr = "2022.04.01";
//		SimpleDateFormat nextSdf = new SimpleDateFormat("yyyy.MM.dd");
//		Date nextDate = nextSdf.parse(nextStr);
//
//		
//		String startStr = "2022.02.14";
//		SimpleDateFormat startSdf = new SimpleDateFormat("yyyy.MM.dd");
//		Date startDate = startSdf.parse(startStr);
//
//		long nextSum = nextDate.getTime() - todayDate.getTime(); 
//		long nextRes = nextSum / (1000 * 60 * 60 * 24);
//		System.out.println(nextRes);
//		
//		long startSum = startDate.getTime() - todayDate.getTime(); 
//		long startRes = startSum / (1000 * 60 * 60 * 24);
//		System.out.println(startRes);
		System.out.println("개원기념일까지 D-day = " + calDday("2022.04.01"));
		System.out.println("학원 처음 온날부터 D-day = " + calDday("2022.02.14") + "일 지남");
		
		System.out.println("\n===========================================\n");
		
		// 달력을 만들어주는 클래스를 만들어 주세요.
		ApiCalendar apiCal = new ApiCalendar(2022, 6);
		apiCal.drawCal();
		
		System.out.println("\n===========================================\n");
		
		// 유니크 ID 생성
		// Guest2022031823193812 님 환영합니다.
		// 6자리의 랜덤 숫자를 이용해서 만든다
		
		// yyyyMMddHHmmssSSS + 랜덤수 6
		System.out.println("Guest" + UtilClass.makeUniqueId() + "님 환영합니다.");
		System.out.println("Guest" + UtilClass.makeUniqueId() + "님 환영합니다.");
		System.out.println("Guest" + UtilClass.makeUniqueId() + "님 환영합니다.");
		
		
		
		
	} // main 끝
	

	static long calDday(String dday) throws ParseException {
		// 오늘 날짜 구하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date today = new Date();		// 2022.03.17 16:33:30
		// 2022.03.18 00:00:00 - 2022.03.17 16:33:30 = 8시간
		// 2022.03.17 00:00:00 만들어 주어야 날짜(일) 계산 용이
		String strToday = sdf.format(today);
		// strToday = 2022.03.17	문자열
		Date sdfToday = sdf.parse(strToday);
		// sdfToday = 2022.03.17 00:00:00 세팅된 Date 객체
		
		Date inputDay = sdf.parse(dday);
		
		long diffMillSec = inputDay.getTime() - sdfToday.getTime();
		long diffDay = diffMillSec / (1000 * 60 * 60 * 24);
		
		return diffDay;
		
	}
	
	
	
}
