package GitHub;

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

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package GitHub;

import java.util.Arrays;
import java.util.Objects;

public abstract class Tariff {	
	protected String name;
	protected int[] price;
	
	public Tariff(String name, int[] price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract int costEffectiveness();
	
	public abstract double getAveragePrice();
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(price);
		result = prime * result + Objects.hash(name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tariff other = (Tariff) obj;
		return Objects.equals(name, other.name) && Arrays.equals(price, other.price);
	}

}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package GitHub;

public class Postpaid extends Tariff{
	private double monthlySubcription;
	
	public Postpaid(String name, int[] price, double subscription) {
		super(name, price);
		monthlySubcription = subscription;	
	}

	public String getPostpaidName() {
		return name;
	}

	public void setPostpaidName(String name) {
		this.name = name;
	}
	
	public int[] getPostpaidPrice() {
		return this.price;
	}
	
	public void setPostpaidPrice(int[] price) {
		this.price = price;
	}
	
	@Override
	public double getAveragePrice() {
		int sum = 0;
		for(int i = 0; i < price.length; i++) {
			sum += price[i];
		}
		return sum / price.length;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int costEffectiveness() {
		return (int) ((this.getAveragePrice() * 100) / this.monthlySubcription);
	}	
	
	@Override
	public String toString() {
		return "Tariff: " + this.name + " Average price: " + this.getAveragePrice();
	}
	
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

package GitHub;

public class Prepaid extends Tariff {

	public Prepaid(String name, int[] price) {
		super(name, price);
	}
	
	public String getPrepaidName() {
		return name;
	}

	public void setPrepaidName(String name) {
		this.name = name;
	}
	
	public int[] getPrepaidPrice() {
		return this.price;
	}
	
	public void setPrepaidPrice(int[] price) {
		this.price = price;
	}
	
	@Override
	public double getAveragePrice() {
		int sum = 0;
		for(int i = 0; i < price.length; i++) {
			sum += price[i];
		}
		return sum / price.length;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public int costEffectiveness() {

		return (int) (this.getAveragePrice() * 2);
	}
	
	@Override
	public String toString() {
		return "Tariff: " + this.name + " Average price: " + this.getAveragePrice();
	}
	
}
