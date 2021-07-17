package GitHub;

public class School_Subjects {

	public static void main(String[] args) {

		Subject[] p = new Subject[3];
		p[0] = new OptionalSubject("WD", new int[]{2,1,2,1});
		p[1] = new MandatorySubject("NRS", new int[]{2,2,2,1}, 1);
		p[2] = new OptionalSubject("KK", new int[]{2,1,2,1});
		if (!p[0].equals(p[2])){
	             System.out.println("Nemaat ist broj na obvrski");
		}
		System.out.println(p[1]);
		for(int i = 0; i< 3; ++i){
			System.out.println(p[i].creditS());
		}


	}

}
