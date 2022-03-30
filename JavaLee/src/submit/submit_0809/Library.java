package submit.submit_0809;

import java.util.ArrayList;

public class Library {
	
	private Library() {
		
	}
	
	private static Library instance = new Library();
	
	public static Library getInstance() {
		return instance;
	}
	
	private ArrayList<Book> bookList = new ArrayList<Book>();
}
