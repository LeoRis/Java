package GitHub;

public class LongMovie extends Movie {
	private int yearOfProduction;
	
	public LongMovie(String name, int[] userReviews, int yearOfProduction) {
		super(name, userReviews);
		this.yearOfProduction = yearOfProduction;
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
		return "Long movie: " + super.name + ", the average rating is: " + this.averageGrade();
	}
	
	public double rank() {
		double coefficient = 0.0;
		if(this.yearOfProduction < 1990) {
			coefficient = this.averageGrade() * 2;
		}
		else if(this.yearOfProduction > 1990) {
			coefficient = this.averageGrade() * 1;
		}
		return coefficient;
	}

}
