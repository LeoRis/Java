import java.util.Scanner;

public class Consultancies {
	public static void main(String[] args) {

		Scanner br = new Scanner(System.in);
		
		ArrayQueue<String> redKratkiPrasanja = new ArrayQueue<String>(50);
		ArrayQueue<String> redZadaci = new ArrayQueue<String>(50);
		ArrayQueue<String> redKratkiPrasanjaZadaci = new ArrayQueue<String>(50);


	    int i,brStudentiKratkiPrasanja,brStudentiZadaci,brStudentiKratkiPrasanjaZadaci;
	    
	    brStudentiKratkiPrasanja=Integer.parseInt(br.nextLine());
	    String[] imeStudentiKratkiPrasanja = new String[brStudentiKratkiPrasanja];

	    for(i=0; i<brStudentiKratkiPrasanja; i++)
	    {
	    	String red = br.nextLine();
	    	String[] pom = red.split(" ");
	    	imeStudentiKratkiPrasanja[i] = pom[0];
	    	redKratkiPrasanja.enqueue(imeStudentiKratkiPrasanja[i]);
	    }

	    brStudentiZadaci=Integer.parseInt(br.nextLine());
	    String[] imeStudentiZadaci = new String[brStudentiZadaci];

	    for(i=0; i<brStudentiZadaci; i++)
	    {
	    	String red = br.nextLine();
	    	String[] pom = red.split(" ");
	    	imeStudentiZadaci[i] = pom[0];
	    	redZadaci.enqueue(imeStudentiZadaci[i]);
	    }

	    brStudentiKratkiPrasanjaZadaci=Integer.parseInt(br.nextLine());
	    String[] imeStudentiKratkiPrasanjaZadaci = new String[brStudentiKratkiPrasanjaZadaci];

	    for(i=0; i<brStudentiKratkiPrasanjaZadaci; i++)
	    {
	    	String red = br.nextLine();
	    	String[] pom = red.split(" ");
	    	imeStudentiKratkiPrasanjaZadaci[i] = pom[0];
	    	redKratkiPrasanjaZadaci.enqueue(imeStudentiKratkiPrasanjaZadaci[i]);
	    }
	    
	    
	    // Vasiot kod ovde...
		
	
	}
}