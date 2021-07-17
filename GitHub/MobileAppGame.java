package GitHub;

public class MobileAppGame extends MobileApp {
	private int levels;
	
	public MobileAppGame(String name, int[] usersRating, int levels) {
		super(name, usersRating);
		this.levels = levels;
	}
	
	public double averageRating() {
		double sum = 0.0;
		for(int i = 0; i < usersRating.length; i++) {
			sum += usersRating[i];
		}
		return sum / usersRating.length;
	}
	
	public double rating() {
		return this.averageRating() * this.levels;
	}
}
