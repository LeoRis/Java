package GitHub;

public class Sitcom extends Movie {
	private int numberOfSeasons;
	
	public Sitcom(String name, int[] userReviews, int numberOfSeasons) {
		super(name, userReviews);
		this.numberOfSeasons = numberOfSeasons;
	}

	public double averageGrade() {
		double sum = 0.0;
		for(int i = 0; i < super.userReviews.length; i++) {
			sum += super.userReviews[i];
		}
		return sum / super.userReviews.length;
	}
	
	@Override
	public String toString() {
		return "Sitcom: " + super.name + ", the averate rating is: " + this.averageGrade();
	}
	
	public double rank() {
		double coefficient = 0.0;
		if(this.numberOfSeasons > 10) {
			coefficient = this.averageGrade() - 1;
		}
		else {
			coefficient = this.averageGrade();
		}
		return coefficient;
	}
}
