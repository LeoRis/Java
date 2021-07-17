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
