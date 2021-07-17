package GitHub;

public class Book extends Sample {
	private int numberOfPages;
	
	public Book(String bookTitle, String bookPublisher, int days, int pages) {
		super(bookTitle, bookPublisher, days);
		this.numberOfPages = pages;
	}

	public void setBookNumberOfPages(int pages) {
		this.numberOfPages = pages;
	}
	
	public int getBookNumberOfPages() {
		return this.numberOfPages;
	}

	@Override
	
	protected Object clone() throws CloneNotSupportedException {
		return this;
	}
	
	@Override
	
	public String toString() {
		return "Book { Title: " + getTitle() + " Publisher: " + getPublisher() + " Number of pages: " + getBookNumberOfPages() + " }";
	}
	
	@Override
	
	public int Score() {
		return getBookNumberOfPages() / getNumberOfRentals();
	}

	
}
