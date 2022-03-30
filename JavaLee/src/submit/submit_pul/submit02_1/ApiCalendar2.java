//package submit.submit_pul.submit02_1;
//
//import java.util.Calendar;
//
//public class ApiCalendar2 {
//	private int year;
//	private int month;
//	
//	public ApiCalendar2(int year, int month) {
//		super();
//		this.year = year;
//		this.month = month;
//	}
//	
//	@Override
//	public String toString() {
//		return "ApiCalendar [year=" + year + ", month=" + month + "]";
//	}
//	public int getYear() {
//		return year;
//	}
//	public void setYear(int year) {
//		this.year = year;
//	}
//	public int getMonth() {
//		return month;
//	}
//	public void setMonth(int month) {
//		this.month = month;
//	}
//	
//	
//	public void drawCal(){
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(year, month-1, 1);
//		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//		int startDay = calendar.get(Calendar.DAY_OF_WEEK);
//		
//		System.out.println(year + "년 " + month + "월 달력");
//		System.out.println("월\t화\t수\t목\t금");
//		
//		int currentDay = 1;
//		
//		for(int i = 1; i <= 42; i++) {
//			if(i >= startDay) {
////				if(!(i%7 == 1 || i % 7 == 0)){
////					System.out.printf("%2d\t", currentDay);
////				}
//				
////				currentDay++;
//			}
//			if(i >= startDay-1) {
//				if(currentDay > lastDay) {
//					break;
//			}
//			System.out.printf("%2d\t", currentDay);
//			currentDay++;
//			}else {
//				System.out.print("\t");
//			}
//			
//			if(i % 7 == 0) {
//				System.out.println();
//			}
//		}
//	}
//	
//	
//}
