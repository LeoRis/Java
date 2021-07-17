package GitHub;

public class EmployeeTest {

	public static void main(String[] args) {
		Date dateOfBirth = new Date(24, 7, 1980);
		Date dateOfEmployment = new Date(12, 3, 2001);
		Employee employee;
		employee = new Employee("John", "James", dateOfBirth, dateOfEmployment);
		
		System.out.println(employee);
	}

}