package GitHub;

// Abstract class: Movie
// Class: LongMovie
// Class: Sitcom

public class Cinema {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Movie[] p = new Movie[10];
		
		p[0] = new LongMovie("Avatar", new int[]{10,8,9,7,10},2009);
		p[1] = (Movie)p[0].clone();
		p[2] = new Sitcom("Avatar", new int[]{10,9,9,7,10}, 10);
		
		if (p[0].equals(p[2])){
	            System.out.println("They have the same name!");
		}
		
		System.out.println(p[1]);
		
		for(int i = 0; i < 3; ++i){
			System.out.println(p[i].rank());
		}

	}

}
