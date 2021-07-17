package GitHub;

class Brod extends Vozilo{
	private int broj_ekipaz;
	private int broj_patnici;
	
	public Brod(String ime, int god_proizv, double pocetnaCena, int broj_ekipaz, int broj_patnici) {
		super(ime, god_proizv, pocetnaCena);
		this.broj_ekipaz = broj_ekipaz;
		this.broj_patnici = broj_patnici;
	}
	
	public String toString() {
		String ret = " ";
		ret += "Generalli za voziloto: " + "\n";
		ret += "--------------------------" + "\n";
		ret += "Ime: " + getIme() + "\n";
		ret += "Godina na proizvodstvo: " + getGod_proizv() + "\n";
		ret += "Pocetna cena: " + getPocetnaCena() + "\n";
		ret += "Cena so danok: " + presmetajCena() + "\n";
		ret += "Broj na ekipaz: " + this.broj_ekipaz + "\n";
		ret += "Broj na patnici: " + this.broj_patnici + "\n";
		return ret;
	}
	
	public double presmetajCena() {
		double cena = getPocetnaCena();
		
		if(broj_patnici > 100) {
			cena += (cena * 0.05);
		}
		return cena;
	}
}