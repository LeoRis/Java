package GitHub;

public class Cosmetics extends Product implements ProductWithDiscount {

	public Cosmetics() {}
	public Cosmetics(int code, String name, double price) throws Exception {
		super(code, name, price);
	}
	
	@Override
	
	public double getPrice() {
		return this.getDiscountPrice();
	}
	
	@Override
	public double getDiscountPrice() {
		if(super.getPrice() > 5 * ProductWithDiscount.euro && super.getPrice() < 23 * ProductWithDiscount.dollar) {
			return super.getPrice() * 0.88;
		}
		if(super.getPrice() >= 23) {
			return super.getPrice() * 0.86;
		}
		return super.getPrice();
	}

	@Override
	public void printDiscountRule() {
		System.out.println("All cosmetic products more expensive than 5 EUR have 12% discount, and those more expensive than 23$ have 14% discount.");
	}

}
