import java.util.Scanner;
import java.util.List;

// Class: Movie
// Class: CoefRatingComparator
// Class: MovieList

public class MovieTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		MovieList moviesList = new MovieList();
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			String title = scanner.nextLine();
			int x = scanner.nextInt();
			int[] ratings = new int[x];
			
			for(int j = 0; j < x; j++) {
				ratings[j] = scanner.nextInt();
			}
			
			scanner.nextLine();
			moviesList.addMovie(title, ratings);
		}
		scanner.close();
		
		List<Movie> movies = moviesList.top10ByAvgRating();
		System.out.println("=== TOP 10 BY AVERAGE RATING ===");
		for(Movie movie : movies) {
			System.out.println(movie);
		}
		
		movies = moviesList.top10ByRatingCoef();
		System.out.println("=== TOP 10 BY RATING COEFFICIENT ===");
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

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

/////////////////////////////////////////////////////////////////////////////////////////////////////////

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
