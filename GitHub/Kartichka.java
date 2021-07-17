package GitHub;

public class Kartichka {
	private double saldo;
	private String id;
	
	public Kartichka() {}
	public Kartichka(double saldo, String id) {
		this.saldo = saldo;
		this.id = id;
	}
	
	public void uplati(double suma) {
		this.saldo += suma;
	}
	
	public boolean isplati(double suma) {
		if(this.saldo > 0 && this.saldo >= suma) {
			this.saldo -= suma;
			return true;
		}else {
			return false;
		}
	}
	
	public void prikaziSaldo() {
		System.out.println(this.id + " : " + this.saldo);
	}
}
