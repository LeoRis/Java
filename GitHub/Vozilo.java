package GitHub;

abstract class Vozilo{
	private String ime;
	private int god_proizv;
	private double pocetnaCena;
	
	public Vozilo(String ime, int god_proizv, double pocetnaCena) {
		this.ime = ime;
		this.god_proizv = god_proizv;
		this.pocetnaCena = pocetnaCena;
	}
	
	public abstract String toString();
	public abstract double presmetajCena();
	
	public void setGod_prizv(int god_proizv) {
		this.god_proizv = god_proizv;
	}
	
	public int getGod_proizv() {
		return god_proizv;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setPocetnaCena(double pocetnaCena) {
		this.pocetnaCena = pocetnaCena;
	}
	
	public double getPocetnaCena() {
		return pocetnaCena;
	}
	
}