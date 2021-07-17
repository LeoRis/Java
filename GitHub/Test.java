package GitHub;

public class Test {

	public static void main(String[] args) {
		Kasa deneshna = new Kasa(10000, 0, 24, 5, 2020);
		Kartichka k;
		
		deneshna.prikaziKasa();
		deneshna.kasaPrimi(5000);
		deneshna.prikaziKasa();
		
		k = new Master(10000, "113311", 54000);
		deneshna.kasaPrimi(10000, k);
		deneshna.prikaziKasa();
		
		k = new Maestro(54000, "332288", "lozinka");
		deneshna.kasaPrimi(10000, k);
		deneshna.prikaziKasa();
		
		Master.setPopust2(0.07);
		k = new Master(10000, "445544", 3000);
		deneshna.kasaPrimi(10000, k);
		deneshna.prikaziKasa();
		
	}

}
