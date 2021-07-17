package GitHub;

public abstract class Sample {

	protected String title;
	protected String publisher;
	protected int rentalsNumber;
	protected String[] reviewers;
	protected int issueDays;
	
	public Sample(String title, String publisher, int numberOfDays) {
		this.title = title;
		this.publisher = publisher;
		this.issueDays = numberOfDays;
	}
	
	public int Score() {
		return 0;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return this.publisher;
	}
	
	public void setNumberOfRentals() {
		this.rentalsNumber = 5;
	}
	
	public int getNumberOfRentals() {
		return 5;
	}
	
	public void setReviewers(String[] review) {
		this.reviewers = review;
	}
	
	public String[] getReviewers() {
		return this.reviewers;
	}
	
	public void setIssueDays(int days) {
		this.issueDays = days;
	}
	
	public int getIssueDays() {
		return this.issueDays;
	}
	
	@Override
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
