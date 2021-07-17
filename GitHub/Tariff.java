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
