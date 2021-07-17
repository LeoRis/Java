package GitHub;

public class Maestro extends Kartichka{
	private String lozinka;
	private final static double popust = 0.05;
	
	public Maestro(double saldo, String id, String lozinka) {
		super(saldo, id);
		this.lozinka = lozinka;
	}
	
	public static double getPopust() {
		return popust;
	}
	
	@Override
	
	public boolean isplati(double cena) {
		double suma = cena * (1 - Maestro.popust);
		return super.isplati(suma);
	}
}
