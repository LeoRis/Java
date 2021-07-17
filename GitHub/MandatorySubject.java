package GitHub;

import java.util.Arrays;
import java.util.Objects;

public class MandatorySubject extends Subject {
	private int seminarWork;
	
	public MandatorySubject(String name, int[] tasks, int seminarWork) {
		super(name, tasks);
		this.seminarWork = seminarWork;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setTasks(int[] tasks) {
		this.tasks = tasks;
	}
	
	public int[] getTasks() {
		return this.tasks;
	}
	
	public void setSeminarWork(int seminarWork) {
		this.seminarWork = seminarWork;
	}
	
	public int getSeminarWork() {
		return this.seminarWork;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
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
	
	@Override
	public int creditS() {
		int sum = 0;
		for(int i = 0; i < tasks.length; i++) {
			sum += tasks[i];
		}
		return sum + this.seminarWork;
	}
	
	@Override
	public String toString() {
		return "Mandatory subject: " + this.name + " credits: " + this.creditS();
	}


}
