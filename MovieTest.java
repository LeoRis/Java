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
