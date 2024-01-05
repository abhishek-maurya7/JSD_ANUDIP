import java.util.ArrayList;

public class Book {
	
	//instance variables
	int bookId;
	String bookName;
	String authorName;
	
	//Parameterized constructor
	public Book(int bookId, String bookName, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	//entry point
	public static void main(String[] args) {
		//declaring an arraylist
		ArrayList<Book> books = new ArrayList<>();
		
		//adding objects of Book class to the arraylist 
		books.add(new Book(1, "Java Programming", "James Gosling"));
		books.add(new Book(2, "Python Programming", "Guido V. Rossum"));
		books.add(new Book(3, "Javascript Programming", "Brendan Eich"));
		
		//printing all books
		 for (Book book : books) {
			 System.out.println("Book ID: " + book.bookId);
	         System.out.println("Book Name: " + book.bookName);
	         System.out.println("Author Name: " + book.authorName);
	         System.out.println("---------------------------");
	     }
	}
}