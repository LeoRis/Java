package GitHub;

public class Employee {
	private String m_name;
	private String m_lastName;
	private Date birthDate;
	private Date employmentDate;
	
	public Employee(String name, String lastName, Date birthday, Date employment) {
		m_name = name;
		m_lastName = lastName;
		birthDate = birthday;
		employmentDate = employment;
	}
	
	public String toString() {
		return String.format("%s, %s, Employed on: %s Birthday: %s", m_lastName, m_name, birthDate, employmentDate);
	}
}
