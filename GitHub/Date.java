package GitHub;

public class Date {
	private int m_day;
	private int m_month;
	private int m_year;
	
	public Date(int day, int month, int year) {
		m_month = checkMonth(month);
		m_day = checkDay(day);
		m_year = year;
		
		System.out.printf("The constructor of Date object for date %s\n", this);
	}
	
	private int checkDay(int testDay) {
		int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(testDay > 0 && testDay <= monthDays[m_month]) {
			return testDay;
		}
		
		if(m_month == 2 && testDay == 29 && (m_year % 400 == 0 || (m_year % 4 == 0 && m_year % 100 == 0))) {
			return testDay;
		}
		
		System.out.printf("Invalid day (%d) is set on 1.", testDay);
		return 1;
	}
	
	private int checkMonth(int testMonth) {
		if(testMonth > 0 && testMonth <= 12) {	// Validate month
			return testMonth;
		}else {
			System.out.printf("Invalid month (%d) is set on 1.", testMonth);
			return 1;
		}
	}
	
	public String toString() {
		return String.format("%d/%d/%d", m_day, m_month, m_year);
	}
	
}
