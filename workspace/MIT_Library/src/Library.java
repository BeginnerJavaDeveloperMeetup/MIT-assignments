public class Library {
	Book bookCatalog[] = new Book[4];
	int numBooks = 0;
	String address;

	Library(String libraryAddress) {
		address = libraryAddress;
	}

	void printAddress() {
		System.out.println(address);
	}

	static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}
	// Add the missing implementation to this class

	void addBook(Book newBook) {
		bookCatalog[numBooks] = newBook;
		numBooks++;
	}

	void printAvailableBooks() {
		if (numBooks == 0) {
			System.out.println("No book in catalog");
		}
		for (int i = 0; i < numBooks; i++) {
			if (!bookCatalog[i].isBorrowed()) {
				System.out.println(bookCatalog[i].getTitle());
			}
		}
	}

	void borrowBook(String string) {
		if (numBooks == 0) {
			System.out.println("Sorry, this book is not in our catalog");
			return;
		}
		for (int i = 0; i < bookCatalog.length; i++)// look through books
		{
			if (bookCatalog[i].borrowed == true) {
				System.out.println("Sorry, this book is already borrowed");
				return;
			}
			if (bookCatalog[i].getTitle().equals(string)) {
				System.out.println("You successfully borrowed " + string);
				bookCatalog[i].borrowed = true;
			}
		}
	}

	void returnBook(String string) {
		for (int i = 0; i < bookCatalog.length; i++){
			if (bookCatalog[i].getTitle().equals(string)) {
				System.out.println("You successfully returned " + string);
				bookCatalog[i].returned();
		}
		}
	}



	public static void main(String[] args) {

		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");

		// // Add four books to the first library
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

		// Try to borrow The Lords of the Rings from both libraries
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
		 firstLibrary.returnBook("The Lord of the Rings");
		 System.out.println();
		
		// // Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}

}