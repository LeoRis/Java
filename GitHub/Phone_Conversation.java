package GitHub;

// Why this program ends with an error??

// Abstract class: Tariff
// Class: Postpaid
// Class: Prepaid

public class Phone_Conversation {

	public static void main(String[] args) {
		Tariff[] p = new Tariff[10];
		
		p[0] = new Prepaid("tarifa1", new int[] {6, 5, 5});
		p[1] = new Postpaid("tarifa2", new int[] {5, 3, 3}, 590);
		p[2] = new Postpaid("tarifa3", new int[] {4, 2, 1}, 10);
		
		if (!p[0].equals(p[2])){
	           System.out.println("Nemaat ista prosecna cena");
		}
		
		System.out.println(p[1]);
		
		for(int i = 0; i < 3; ++i){
			System.out.println(p[i].costEffectiveness());
		}
		
	}

}
