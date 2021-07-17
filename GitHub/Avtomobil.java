package GitHub;

class Avtomobil extends Vozilo{
	double danok;
	char boja;
	double cena_oprema;
	
	public Avtomobil(String ime, int god_proizv, double pocetnaCena, double danok, char boja, double cena_oprema) {
		super(ime, god_proizv, pocetnaCena);
		this.danok = danok;
		this.boja = boja;
		this.cena_oprema = cena_oprema;
	}
	
	public String toString() {
		String ret = " ";
		ret += "Generalli za voziloto: " + "\n";
		ret += "--------------------------" + "\n";
		ret += "Ime: " + getIme() + "\n";
		ret += "Godina na proizvodstvo: " + getGod_proizv() + "\n";
		ret += "Pocetna cena: " + getPocetnaCena() + "\n";
		ret += "Danok: " + this.danok + "\n";
		ret += "Boja: " + this.boja + "\n";
		ret += "Cena na platena dopolnitelna oprema: " + this.cena_oprema + "\n";
		return ret;
	}
	
	public double presmetajCena() {
		return getPocetnaCena() - this.danok + this.cena_oprema;
	}
}