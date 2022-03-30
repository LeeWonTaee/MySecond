package submit.submit_1011.submit03;
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
				String strDb1 = dbList.get(j).getDate();
				String strDb2 = dbList.get(j+1).getDate();
				Date dateDb1 = sdf.parse(strDb1);
				Date dateDb2 = sdf.parse(strDb2);
				
				long longDb1 = dateDb1.getTime();
				long longDb2 = dateDb2.getTime();
				
				if(longDb1 > longDb2) {
					DateBoard temp = dbList.get(j);
					dbList.set(j, dbList.get(j+1));
					dbList.set(j+1, temp);
				}
			}
		}
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println("\n=================================\n");
		// 4.
		System.out.println("최근 한달 내 작성된 게시글");
		Date dateToday = new Date();
		for(int i = 0; i < dbList.size(); i++) {
			String strDb = dbList.get(i).getDate();
			Date dateDb = sdf.parse(strDb);
			
			long resultTime = dateToday.getTime() - dateDb.getTime();  
			long diffTime = resultTime / (1000 * 60 * 60 * 24);
			if(diffTime < 30) {
				System.out.println(dbList.get(i));
			}
		}
		System.out.println("\n=================================\n");
		// 5.
		System.out.println("이번달 작성된 게시글");
		for(int i = 0; i < dbList.size(); i++) {
			sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			SimpleDateFormat dbSdf = new SimpleDateFormat("MM");
			String strDb = dbList.get(i).getDate();
			Date dateDb = sdf.parse(strDb);
			String dateToStr = dbSdf	.format(dateDb);
			int strToInt = Integer.parseInt(dateToStr);
			if(strToInt == 3) {
				System.out.println(dbList.get(i));
			}
			
		}
		System.out.println("\n=================================\n");
		// 6.
		System.out.println("2월에 작성된 게시글");
		for(int i = 0; i < dbList.size(); i++) {
			sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			SimpleDateFormat dbSdf = new SimpleDateFormat("MM");
			String strDb = dbList.get(i).getDate();
			Date dateDb = sdf.parse(strDb);
			String dateToStr = dbSdf	.format(dateDb);
			int strToInt = Integer.parseInt(dateToStr);
			if(strToInt == 2) {
				System.out.println(dbList.get(i));
			}
			
		}
		System.out.println("\n=================================\n");
		// 7.  
		System.out.println("2022년 2월 14일부터 2022년 3월 21일까지 작성된 게시글");
		for(int i = 0; i < dbList.size(); i++) {
			sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			SimpleDateFormat dbSdf = new SimpleDateFormat("yyyyMMdd");
			String strDb = dbList.get(i).getDate();
			Date dateDb = sdf.parse(strDb);
			String dateToStr = dbSdf	.format(dateDb);
			int strToInt = Integer.parseInt(dateToStr);
			if(strToInt > 20220214 && strToInt < 20220321) {
				System.out.println(dbList.get(i));
			}
			
		}
		System.out.println("\n=================================\n");
	}
	
}