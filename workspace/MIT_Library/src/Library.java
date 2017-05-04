import java.util.ArrayList;

public class Library {
	String address;
	ArrayList<Book> books = new ArrayList<Book>();
	
	Library(String NewAddress) {
		address = NewAddress;
	}
	
	void addBook(Book newBook){
		books.add(newBook);
	}
	
	void printAddress(){
		System.out.println(address);
	}
	
	static void printOpeningHours(){
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	
	void printAvailableBooks(){
		for(int i=0; i<books.size();i++){
			System.out.println(books.get(i).title);
		}
	}
	
	void borrowBook(String searchingBook){
			for(int i=0; i<books.size();i++){
			if(books.get(i).title.equals(searchingBook)){
				if(books.get(i).isBorrowed()){
					System.out.println("Sorry, this book is already borrowed.");
				}
				else{
					books.get(i).borrowed();
					System.out.println("You successfully borrowed " + searchingBook);
				}
				
							}
		}
	}

	// Add the missing implementation to this class
	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		// Add four books to the first library
		 firstLibrary.addBook(new Book("The Da Vinci Code"));
		 firstLibrary.addBook(new Book("Le Petit Prince"));
		 firstLibrary.addBook(new Book("A Tale of Two Cities"));
		 firstLibrary.addBook(new Book("The Lord of the Rings"));
		// // Print opening hours and the addresses
		 System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		// // Try to borrow The Lords of the Rings from both libraries
		 System.out.println("Borrowing The Lord of the Rings:");
		 firstLibrary.borrowBook("The Lord of the Rings");
		 firstLibrary.borrowBook("The Lord of the Rings");
		 secondLibrary.borrowBook("The Lord of the Rings");
		 System.out.println();
		// // Print the titles of all available books from both libraries
		 System.out.println("Books available in the first library:");
		 firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
		// // Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		//firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		// // Print the titles of available from the first library
		 System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}