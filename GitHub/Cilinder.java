package GitHub;

public class Cilinder extends ZaoblenOblik{
	private double visina;
	private double agol;
	
	public Cilinder() {}
	
	public Cilinder(double radius, double visina) {
		super(radius);
		this.visina = visina;
		this.agol = 90;
	}
	
	public Cilinder(double radius, double visina, double agol) {
		super(radius);
		this.visina = visina;
		this.agol = 90.00;
	}
	
	@Override
	
	public double volumen() {
		return Math.PI * Math.pow(getRadius(), 2) * this.visina;
	}
	
	@Override
	
	public double visina() {
		return this.visina;
	}
	
	public String toString() {
		return "Cilinder{ " + super.toString() + " visina = " + visina + " agol = " + agol + " }";
	}
}
