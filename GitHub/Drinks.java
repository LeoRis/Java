package GitHub;

public class Drinks extends Product implements ProductWithDiscount {
	private boolean ifAlcohol;
	private double _volume;
	
	public Drinks() {}
	public Drinks(int code, String name, double price, boolean alcohol, double volume) throws Exception {
		super(code, name, price);
		ifAlcohol = alcohol;
		_volume = volume;
	}
	
	@Override
	public double getPrice() {
		return this.getDiscountPrice();
	}
	
	@Override
	public double getDiscountPrice() {
		if(this.ifAlcohol) {
			if(super.getPrice() > 10) {
				return super.getPrice() * 0.9;
			}
		}
		if(!this.ifAlcohol) {
			if(this._volume > 1) {
				return super.getPrice() * 0.95;
			}
		}
		return super.getPrice();
	}

	@Override
	public void printDiscountRule() {
		System.out.println("The alcoholic drinks that are more expensive than 10$ have 10% discount, and non-alcoholic drinks larger than 1 liter have 5% discount.");
		
	}
	
	@Override
	public String toString() {
		return "Drink { " + super.toString() + " ifAlcohol: " + this.ifAlcohol + " Volume: " + this._volume + " }"; 
	}

}
