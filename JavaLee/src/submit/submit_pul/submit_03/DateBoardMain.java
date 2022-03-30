package submit.submit_pul.submit_03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateBoardMain {
	public static void main(String[] args) throws ParseException {
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for(int i = 0; i < 30; i++) {
			int randMonth = (int)(Math.random() * 3) + 1;		// 1~3
			int randDay = (int)(Math.random() * 28) + 1;		// 1~28	
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth-1, randDay);
					
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}
				
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		System.out.println("\n=================================\n");
		// 3.
		System.out.println("날짜별로 정렬 후 출력");
		for(int i = 0; i < dbList.size()-1; i++) {
			for(int j = 0; j < dbList.size()-1-i; j++) {
				Date prev = sdf.parse(dbList.get(j).getDate());
				Date post = sdf.parse(dbList.get(j+1).getDate());
				if(prev.getTime() > post.getTime()) { // 부등호 바꾸면 거꾸로
					DateBoard temp = dbList.get(j);
					dbList.set(j, dbList.get(j+1));
					dbList.set(j+1, temp);
				}
			}
		}
		for(DateBoard db : dbList) {
			System.out.println(db);
		}
		
		System.out.println("\n=================================\n");
		// 4.
		System.out.println("최근 한달 내 작성된 게시글");
		ArrayList<DateBoard> temp = new ArrayList<DateBoard>();
		Date today = new Date();
		
		long oneMonth = 1000 * 60 * 60 * 24 * 30L;
		
		for(int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());
			if(today.getTime() - oneMonth < currDate.getTime()) {
				temp.add(dbList.get(i));
			}
		}
		for(DateBoard db : temp) {
			System.out.println(db);
		}
		
		System.out.println("\n=================================\n");
		// 5.
		System.out.println("이번달 작성된 게시글");
		temp.clear();
		Calendar calToday = Calendar.getInstance();
		int month = calToday.get(Calendar.MONTH);
		int year = calToday.get(Calendar.YEAR);
		
		for(int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());
			Calendar currCal = Calendar.getInstance();
			currCal.setTime(currDate);
			
			if(currCal.get(Calendar.YEAR) == year
					&& currCal.get(Calendar.MONTH) == month) {
				temp.add(dbList.get(i));
			}
		}
		for(DateBoard db : temp) {
			System.out.println(db);
		}
		
		System.out.println("\n=================================\n");
		// 6.
		temp.clear();
		System.out.println("2월에 작성된 게시글");
		for(int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());
			Calendar currCal = Calendar.getInstance();
			currCal.setTime(currDate);
			
			if(currCal.get(Calendar.MONTH) == (2-1)) {
				temp.add(dbList.get(i));
			}
		}
		for(DateBoard db : temp) {
			System.out.println(db);
		}
		System.out.println("\n=================================\n");
		// 7.  
		System.out.println("2022년 2월 14일부터 2022년 3월 21일까지 작성된 게시글");
		
		temp.clear();
		// 날짜형 문자열을 바꿀때 정확하게 맞춰줘야한다.
		SimpleDateFormat newSdf = new SimpleDateFormat("yyyy.MM.dd");
		Date fromDate = newSdf.parse("2022.02.14");
		Date toDate = newSdf.parse("2022.03.21");
		
		for(int i = 0; i < dbList.size(); i++) {
			Date currDate = sdf.parse(dbList.get(i).getDate());
			
			if((fromDate.getTime() <= currDate.getTime()
					&& currDate.getTime() <= toDate.getTime())) {
				temp.add(dbList.get(i));
			}
		}
		for(DateBoard db : temp) {
			System.out.println(db);
		}
		
		
		
		
		
		
		
		
		System.out.println("\n=================================\n");
	}
	
}