package GitHub;

public class Konus extends ZaoblenOblik{
	private double visina;
	private double agol;
	
	public Konus() {}
	
	public Konus(double radius, double visina) {
		super(radius);
		this.visina = visina;
		this.agol = 90;
	}
	
	public Konus(double radius, double visina, double agol) {
		super(radius);
		this.visina = visina;
		this.agol = 90.00;
	}
	
	@Override
	
	public double volumen() {
		return this.visina * Math.PI * Math.pow(getRadius(), 2) / 3.00;
	}
	
	@Override
	
	public double visina() {
		return this.visina;
	}
	
	public String toString() {
		return "Konus{ " + super.toString() + " visina = " + visina + " agol = " + agol + " }";
	}
}
