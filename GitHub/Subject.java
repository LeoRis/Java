package GitHub;

import java.util.Arrays;
import java.util.Objects;

public abstract class Subject {
	protected String name;
	protected int[] tasks;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(tasks);
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
		Subject other = (Subject) obj;
		return Objects.equals(name, other.name) && Arrays.equals(tasks, other.tasks);
	}

	public Subject(String name, int[] tasks) {
		this.name = name;
		this.tasks = tasks;
	}

	public abstract int creditS();
	
	
}
