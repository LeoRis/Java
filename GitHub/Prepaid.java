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
