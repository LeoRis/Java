import java.util.Comparator;

public class CoefRatingComparator implements Comparator<Movie> {
	int maxRatings;
	
	public CoefRatingComparator(int maxRatings) {
		this.maxRatings = maxRatings;
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		int ar = Double.compare(o1.avgRating * o1.ratings.size() / maxRatings, o2.avgRating * o2.ratings.size() / maxRatings);
		
		if(ar == 0) {
			return o1.title.compareTo(o2.title);
		}
		return -ar;
	}

}
