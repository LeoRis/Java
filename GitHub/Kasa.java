package GitHub;

public class Kasa {
	private double sumaVoKasa;
	private double sumaOdKarticka;
	private int den, mesec, godina;
	
	public Kasa() {}
	public Kasa(double sumaVoKasa, double sumaOdKarticka, int den, int mesec, int godina) {
		this.sumaVoKasa = sumaVoKasa;
		this.sumaOdKarticka = sumaOdKarticka;
		this.den = den;
		this.mesec = mesec;
		this.godina = godina;
	}
	
	public void kasaPrimi(double smetka) {
		this.sumaVoKasa += smetka;
	}
	
	public void kasaPrimi(double smetka, Kartichka k) {
		if(k.isplati(smetka)) {
			this.sumaOdKarticka += smetka;
		}
	}
	
	public double vratiPrihod() {
		return this.sumaOdKarticka + this.sumaVoKasa;
	}
	
	public void prikaziKasa() {
		System.out.println("Den: " + den);
		System.out.println("Mesec: " + mesec);
		System.out.println("Godina: " + godina);
		System.out.println("Prihod - vkupno: " + vratiPrihod());
	}
}
