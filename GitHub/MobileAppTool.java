package GitHub;

public class MobileAppTool extends MobileApp {
	private String toolType;
	
	public MobileAppTool(String name, int[] usersRating, String toolType) {
		super(name, usersRating);
		this.toolType = toolType;
	}
	
	public double averageRating() {
		double sum = 0.0;
		for(int i = 0; i < usersRating.length; i++) {
			sum += usersRating[i];
		}
		return sum / usersRating.length;
	}
	
	public double rating() {
		return this.averageRating();
	}

}
