package category;

/* Class that represents the books/movies interest */
public class Book extends Product {
	/* BookMovie attributes: author (book), number of pages (book), director (movie) and duration (movie) */
	private String authorBook;
	private int numberPagesBook;
	
	/* Empty constructor */
	public Book() {

	}

	/* Book constructor, including those in the superclass Products */
	public Book(String authorBook, int numberPagesBook, String nameProduct, String descriptionProduct, 
			String storeProduct, String imageProduct, double priceProduct) {
		super(nameProduct, descriptionProduct, storeProduct, imageProduct, priceProduct);
		this.authorBook = authorBook;
		this.numberPagesBook = numberPagesBook;
	}
	
	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public String getAuthorBook() {
		return authorBook;
	}

	public void setAuthorBook(String authorBook) {
		this.authorBook = authorBook;
	}

	public int getNumberPagesBook() {
		return numberPagesBook;
	}

	public void setNumberPagesBook(int numberPagesBook) {
		this.numberPagesBook = numberPagesBook;
	}
}
