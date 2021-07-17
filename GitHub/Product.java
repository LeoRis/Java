package GitHub;

public class Product {
	private int _code;
	private String _name;
	private double _price;
	
	public Product() {}
	public Product(int code, String name, double price) throws Exception {
		
		if(_price < 0) {
			throw new Exception();
		}
		
		_code = code;
		_name = name;
		_price = price;
	}
	
	public void setCode(int code) {
		_code = code;
	}
	
	public int getCode() {
		return this._code;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public String getName() {
		return this._name;
	}
	
	public void setPrice(double price) throws Exception {
		if(_price < 0) {
			throw new Exception();
		}
			this._price = _price;
	}
	
	public double getPrice() {
		return this._price;
	}
	
	public String toString() {
		return "Product { Code: " + this._code + " Name: " + this._name + " Price: " + this._price + "$";
	}
	
}
