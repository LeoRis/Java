package GitHub;

public class Master extends Kartichka {
	private double limit;
	private final static double popust1 = 0.03; // Limit pod 6000
	private static double popust2 = 0.10; // Limit nad 6000
	
	public Master() {}
	public Master(double saldo, String id, double limit) {
		super(saldo, id);
		this.limit = limit;
	}
	
	public static double getPopust1() {
		return popust1;
	}
	
	public static double getPopust2() {
		return popust2;
	}
	
	public static void setPopust2(double popust) {
		Master.popust2 = popust2;
	}
	
	@Override
	
	public boolean isplati(double cena) {
		if(this.limit < 6000) {
			double suma = cena * (1 - Master.popust1);
			return super.isplati(suma);
		}else{
			double suma = cena * (1 - Master.popust2);
			return super.isplati(suma);
		}
	}
}
