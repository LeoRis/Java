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
