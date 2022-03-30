package submit.submit_1011.submit01;

public class CartoonBoard extends Board{
	private String imgFile;
	
	public CartoonBoard(int no, String title, String date, String content, String imgFile) {
		super(no, title, date, content);
		this.imgFile = imgFile;
	}
	
	@Override
	public String toString() {
		return "["+ super.getNo() + ". |" + super.getTitle() + " | " + super.getDate() + "]";
	}
	
	public String getImgFile() {
		return imgFile;
	}

	public void setImgFile(String imgFile) {
		this.imgFile = imgFile;
	}
	
	
	
}
