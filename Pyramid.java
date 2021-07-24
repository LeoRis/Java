public class Pyramid {

	public static void main(String[] args) {
	    for(int i = 0; i <= 9; i++){
	        for(int j = 0; j <= 2 * 9 - 1; j++){
	            if(j >= 9 - (i - 1) && j <= 9 + (i - 1)){
	                System.out.print("*");
	            }else{
	                System.out.print(" ");
	            }
	        }
	        System.out.print("\n");
	    }
	}

}
