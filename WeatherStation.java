import java.time.LocalDateTime;
import java.util.TreeSet;
import java.util.function.Predicate;

public class WeatherStation {
	TreeSet<Measurement> measurements;
	private int days;
	
	public WeatherStation(int days) {
		this.days = days;
		this.measurements = new TreeSet<>();
	}
	
	public void addMeasurement(float temperature, float wind, float humidity, float visibility, LocalDateTime date) {
		Measurement m = new Measurement(temperature, wind, humidity, visibility, date);
		if(!measurements.add(m)) {
			return ;
		}
		
		Predicate<Measurement> old = measurement -> (measurement.date.minusDays(days).isAfter(date));
		measurements.removeIf(old);
	}
	
	public int total() {
		return measurements.size();
	}
	
	public void status(LocalDateTime from, LocalDateTime to) {
		Predicate<Measurement> isInRange = measurement -> !(measurement.date.isBefore(from)) || measurement.date.isAfter(to);
		
		double averageTemperature = measurements.stream().filter(isInRange).mapToDouble(measurement -> measurement.temperature).average().orElse(0);
		measurements.stream().filter(isInRange).forEach(System.out::println);
		
		System.out.printf("Average temperature: %.2f\n", averageTemperature);
	}
}
