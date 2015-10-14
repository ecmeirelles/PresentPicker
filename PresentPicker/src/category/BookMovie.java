package category;

/* Class that represents the books/movies interest */
public class BookMovie extends Product {
	/* BookMovie attributes: author (book), number of pages (book), director (movie) and duration (movie) */
	private String authorBook;
	private String directorMovie;
	private String durationMovie;
	private int numberPagesBook;
	
	/* Empty constructor */
	public BookMovie() {

	}

	/* Full constructor, including those in the superclass Products */
	public BookMovie(String authorBook, String directorMovie, String durationMovie, int numberPagesBook,
			String nameProduct, String descriptionProduct, String storeProduct, String imageProduct, 
			float priceProduct) {
		super(nameProduct, descriptionProduct, storeProduct, imageProduct, priceProduct);
		this.authorBook = authorBook;
		this.directorMovie = directorMovie;
		this.durationMovie = durationMovie;
		this.numberPagesBook = numberPagesBook;
	}
	
	/* Getters and Setter methods to access and to modify, respectively, the attributes */
	public String getAuthorBook() {
		return authorBook;
	}

	public void setAuthorBook(String authorBook) {
		this.authorBook = authorBook;
	}

	public String getDirectorMovie() {
		return directorMovie;
	}

	public void setDirectorMovie(String directorMovie) {
		this.directorMovie = directorMovie;
	}

	public String getDurationMovie() {
		return durationMovie;
	}

	public void setDurationMovie(String durationMovie) {
		this.durationMovie = durationMovie;
	}

	public int getNumberPagesBook() {
		return numberPagesBook;
	}

	public void setNumberPagesBook(int numberPagesBook) {
		this.numberPagesBook = numberPagesBook;
	}
}
