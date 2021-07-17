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
