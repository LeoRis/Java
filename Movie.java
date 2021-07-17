import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Movie {
	public String title;
	List<Integer> ratings;
	double avgRating;
	
	public Movie(String title, int[] ratings) {
		this.title = title;
		this.ratings = IntStream.of(ratings).boxed().collect(Collectors.toList());
		avgRating = this.ratings.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double getAvgRating() {
		return this.avgRating;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%.2f) of %d ratings.", title, avgRating, ratings.size());
	}
}
