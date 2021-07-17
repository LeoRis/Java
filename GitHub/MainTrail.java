package GitHub;

public class MainTrail {

	public static void main(String[] args) {
		ListTrail list = new ListTrail("Trail1");
		Trail trail1 = new Trail("Skopje", "Veles", 36.0);
		Trail trail2 = new Trail("Skopje", "Veles",180.0);
		Trail trail3 = new Trail("Ohrid", "Ohrid",0);
		
		try {
			list.pass(trail1);
			list.pass(trail2);
			list.pass(trail3);
		} catch (OutOfMemoryError e) {
		    System.out.println(e.getMessage());
		}
		list.newTrails(20);
		System.out.println(list.nrSamePositions());	
		System.out.println(list);	

	}

}
