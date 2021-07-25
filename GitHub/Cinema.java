package GitHub;

// Abstract class: Movie
// Class: LongMovie
// Class: Sitcom

public class Cinema {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Movie[] p = new Movie[10];
		
		p[0] = new LongMovie("Avatar", new int[]{10,8,9,7,10},2009);
		p[1] = (Movie)p[0].clone();
		p[2] = new Sitcom("Avatar", new int[]{10,9,9,7,10}, 10);
		
		if (p[0].equals(p[2])){
	            System.out.println("They have the same name!");
		}
		
		System.out.println(p[1]);
		
		for(int i = 0; i < 3; ++i){
			System.out.println(p[i].rank());
		}

	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package GitHub;

import java.util.Objects;

public abstract class Movie implements Cloneable  {
	protected String name;
	protected int[] userReviews;
	
	public Movie(String name, int[] userReviews) {
		this.name = name;
		this.userReviews = userReviews;
	}
	
	public abstract double averageGrade();
	
	public abstract double rank();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;

		Movie other = (Movie) obj;
		return Objects.equals(name, other.name);
		
		// This option works as well.
//		if(this.name != other.name) {
//			return false;
//		}
//		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

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

/////////////////////////////////////////////////////////////////////////////////////////////////////////

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
