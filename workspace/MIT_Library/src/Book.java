public class Book {
	String title;
	boolean borrowed;
	
	public static void main(String[] arguments) {
		// Small test of the Book class
		Book example = new Book("The Da Vinci Code");
		System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
		System.out.println("Borrowed? (should be false): " + example.isBorrowed());
		example.rented();
		System.out.println("Borrowed? (should be true): " + example.isBorrowed());
		example.returned();
		System.out.println("Borrowed? (should be false): " + example.isBorrowed());
	}
	// Creates a new Book
	public Book(String bookTitle) {
		title = bookTitle;
		// Implement this method
	}

	// Marks the book as rented
	public void borrowed() {
		borrowed = true;
	}

	// Marks the book as not rented
	public void returned() {
		borrowed = false;
	}

	// Returns true if the book is rented, false otherwise
	public boolean isBorrowed() {
		return borrowed;
	}
	
	public void rented(){
		borrowed = true;
	}

	// Returns the title of the book
	public String getTitle() {
		return title;
	}


}