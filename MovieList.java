import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;

public class MovieList {
	List<Movie> movies;
	
	public MovieList() {
		movies = new ArrayList<>();
	}
	
	public void addMovie(String title, int[] ratings) {
		Movie movie = new Movie(title, ratings);
		movies.add(movie);
	}
	
	public List<Movie> top10ByAvgRating(){
		return movies.stream().sorted(Comparator.comparing(Movie::getAvgRating).reversed().thenComparing(Comparator.comparing(Movie::getTitle))).limit(10).collect(Collectors.toList());
	}
	
	public List<Movie> top10ByRatingCoef(){
		int maxRatings = movies.stream().map(movie -> movie.ratings.size()).reduce(0, Math::max);
		
		return movies.stream().sorted(new CoefRatingComparator(maxRatings)).limit(10).collect(Collectors.toList());
	}
}
