package GitHub;

public class Library {

	public static void main(String[] args) throws CloneNotSupportedException {
		Sample[] s = new Sample[10];
		
		String[] reviewers = new String[2];
		
		reviewers[0] = "recenzent1";
		reviewers[1] = "recenzent2";
		s[0] = new Book("ime1", "izdavac1", 10, 220);
		s[1] = (Book)s[0].clone();
		s[2] = new Publication("ime3", "izdavac1", 9, 4.67f);
		if (s[0].equals(s[2])){
	             System.out.println("Imaat ist izdavac");
	    	}
		System.out.println(s[1]);
		for(int i = 0; i < 3; ++i){
			 System.out.println(s[i].Score());
		}

		
	}

}
