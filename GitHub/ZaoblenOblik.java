package GitHub;

public abstract class ZaoblenOblik {
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public ZaoblenOblik() {radius = 0.00;}
	public ZaoblenOblik(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return "radius = " + this.radius;
	}
	
	public abstract double visina();
	public abstract double volumen();
	
}
