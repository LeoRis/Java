package GitHub;

// Abstract class: MobileApp
// Class: MobileAppTool
// Class: MobileAppGame

public class MainApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		MobileApp[] m = new MobileApp [10];
		
		m[0] = new MobileAppTool("Sparrow", new int[]{5,3,2,4,5}, "Mail client");
		m[1] = (MobileApp)m[0].clone();
		m[2] = new MobileAppGame("Angry Birds", new int[]{5,1,5,4,5}, 100);
		
		if (m[0].equals(m[2])){
	            System.out.println("Same number of users!");
		}
		
		System.out.println(m[1]);
		
		for(int i = 0; i < 3; ++i){
			System.out.println(m[i].rating());
		}

	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package GitHub;

public abstract class MobileApp implements Cloneable {
	protected String name;
	protected int[] usersRating;
	
	public MobileApp(String name, int[] usersRating) {
		this.name = name;
		this.usersRating = usersRating;
	}
	
	public abstract double averageRating();
	
	public abstract double rating();
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		
		MobileApp other = (MobileApp)obj;
		
		if(this.usersRating.length != other.usersRating.length) {
			return false;
		}
		return true;
	}

		
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		MobileApp cloned = (MobileApp)super.clone();
		cloned.name = name;
		cloned.usersRating = usersRating;
		return cloned;
	}

	@Override
	public String toString() {
		return "The name of the mobile app is: " + this.name + ", and it's average rating is: " + this.averageRating();
	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

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

/////////////////////////////////////////////////////////////////////////////////////////////////////////

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
