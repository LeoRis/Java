package GitHub;

public class Trail {
	private String startingPoint;
	private String endPoint;
	private double trailLength;
	
	public Trail() {}
	public Trail(String start, String end, double length) {
		startingPoint = start;
		endPoint = end;
		trailLength = length;
	}
	
	public void setStart(String start) {
		startingPoint = start;
	}
	
	public String getStart() {
		return this.startingPoint;
	}
	
	public void setEnd(String end) {
		endPoint = end;
	}
	
	public String getEnd() {
		return this.endPoint;
	}
	
	public void setLength(double length) {
		trailLength = length;
	}
	
	public double getLength() {
		return this.trailLength;
	}
}
