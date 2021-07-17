package GitHub;

import java.util.Scanner;

public class Supermarket {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int numberOfProducts = 7;
		
		Product[] basket = new Product[numberOfProducts];

//		basket[0] = new Food(1, "bread", 20.00);
//	 	basket[1] = new Drinks(2, "tekila", 1200.00, true, 0.7);
//	 	basket[2] = new Food(3, "cheese", 230.0);
//	 	basket[3] = new Drinks(4, "whiskey", -2000.0, true, 1.4);
//	 	basket[4] = new Cosmetics(5, "shampoo", 350.0);
//	 	basket[5] = new Drinks(6, "juice", 85.0, false, 2.6);
//	 	basket[6] = new Cosmetics(7, "cream", 650.0);

	 	double sum = 0;
	 	
	 	for(int i = 0; i < numberOfProducts; i++) {
	 		sum += basket[i].getPrice();
	 	}
	 	
	 	System.out.println("The total price of all products is: " + sum + "\n");
	 	
	 	ProductWithDiscount[] discountBasket = new ProductWithDiscount[numberOfProducts];
	 	
	 	int j = 0;
	 	
	 	for(int i = 0; i < basket.length; i++) {
	 		if(!(basket[i] instanceof Food)) {
	 			discountBasket[j++] = (ProductWithDiscount) basket[i];
	 		}
	 	}
	 	
	 	for(int i = 0; i < j; i++) {
	 		System.out.println(" " + discountBasket[i]);
	 	}
	 	
	 	System.out.println("Insert code: ");
	 	int newCode = input.nextInt();
	 	
	 	for(int i = 0; i < j; i++) {
	 		if(((Product)discountBasket[i]).getCode() == newCode) {
	 			System.out.println("The price with discount is: " + discountBasket[i].getDiscountPrice());
	 		}
 			discountBasket[i].printDiscountRule();
	 	}
	 	
	 	//Testing for exceptions.
	 	
//		int numberOfProducts = 0;
//		
//		Product[] basket = new Product[numberOfProducts];
//		try {
//		basket[numberOfProducts++] = new Food(1, "bread", 20.00);
//	 	basket[numberOfProducts++] = new Drinks(2, "tekila", 1200.00, true, 0.7);
//	 	basket[numberOfProducts++] = new Food(3, "cheese", 230.0);
//	 	basket[numberOfProducts++] = new Drinks(4, "whiskey", -2000.0, true, 1.4);
//	 	basket[numberOfProducts++] = new Cosmetics(5, "shampoo", 350.0);
//	 	basket[numberOfProducts++] = new Drinks(6, "juice", 85.0, false, 2.6);
//	 	basket[numberOfProducts++] = new Cosmetics(7, "cream", 650.0);
//		}
//		catch(Exception e){
//			System.out.println("Caugth EXCEPTION in main!");
//			System.out.println("Valid only " + numberOfProducts + " products!");
//			
//		}
	}

}
