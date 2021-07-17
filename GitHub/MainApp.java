package GitHub;

// Abstract class: MobileApp
// Class: MobileAppTool
// Class: MobileAppGame

public class MainApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		MobileApp[] m = new MobileApp [10];
		
		m[0] = new MobileAppTool("Sparrow", new int[]{5,3,2,4,5}, "Mail client");
		m[1] = (MobileApp)m[0].clone();
		m[2] = new MobileAppGame("Angry Birds", new int[]{5,1,5,4,5}, 100);
		
		if (m[0].equals(m[2])){
	            System.out.println("Same number of users!");
		}
		
		System.out.println(m[1]);
		
		for(int i = 0; i < 3; ++i){
			System.out.println(m[i].rating());
		}

	}

}
