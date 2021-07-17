package GitHub;

public class Topka extends ZaoblenOblik{
	
	public Topka(double radius) {
		super(radius);
	}
	
	@Override
	
	public double volumen() {
		return 4.00 * Math.PI / 3.00 * Math.pow(getRadius(), 3);
	}
	
	@Override
	
	public double visina() {
		return this.getRadius() * 2.00;
	}
	
	public String toString() {
		return "Topka (" + super.toString() + ")";
	}
}
