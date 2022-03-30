package submit.submit_0809;

public class Book {
	private int no;
	private String name;
	private boolean dae = false;
	
	
	public Book(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public boolean dae(boolean da) {
		if(da == false) {
			System.out.println("입고중");
			return false;
		}
		return true;
	}
	

	@Override
	public String toString() {
		return "[책번호 :" + no + ", 책 제목 : " + name + ", 대여상태 : " + dae + "]";
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isDae() {
		return dae;
	}


	public void setDae(boolean dae) {
		this.dae = dae;
	}
	
	
}
