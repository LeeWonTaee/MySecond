package submit.submit_0809;

public class LibraryMain {
	public static void main(String[] args) {
		Library library = Library.getInstance();
		
		
		Book book1 = new Book(1, "삼국지");
		System.out.println(book1);
	}
}
