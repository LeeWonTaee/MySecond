package submit.submit_0809;

public class Traffic {
	private String name;		// 교통수단 이름
	private int minute; 		// 걸린 시간
	public Traffic(String name, int minute) {
		super();
		this.name = name;
		this.minute = minute;
	}
	
	public Traffic() {
		
	}
	@Override
	public String toString() {
		return name + " " + minute + "분 예상";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	
}
