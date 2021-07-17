package GitHub;

public class Company_Employee {
	private String e_name;
	private int e_salary;
	private Work_Position e_position;
	
	public Company_Employee() {}
	public Company_Employee(String name, int salary, Work_Position position) {
		e_name = name;
		e_salary = salary;
		e_position = position;
	}
	
	public void setName(String name) {
		this.e_name = name;
	}
	
	public void setSalary(int salary) {
		this.e_salary = salary;
	}
	
	public void setPosition(Work_Position position) {
		this.e_position = position;
	}
	
	public String getName() {
		return e_name;
	}
	
	public int getSalary() {
		return e_salary;
	}
	
	public Work_Position getPosition() {
		return e_position;
	}
}