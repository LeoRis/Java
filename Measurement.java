import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Measurement implements Comparable<Measurement> {
	float temperature;
	float wind;
	float humidity;
	float visibility;
	LocalDateTime date;
	
	public Measurement(float temperature, float wind, float humidity, float visibility, LocalDateTime date) {
		this.temperature = temperature;
		this.wind = wind;
		this.humidity = humidity;
		this.visibility = visibility;
		this.date = date;
	}
	
	@Override
	public int compareTo(Measurement other) {
		long span = Math.abs(other.date.until(date, ChronoUnit.SECONDS));
		if(span < 150) {
			return 0;
		}
		else {
			return date.compareTo(other.date);
		}
	}
	
	@Override
	public String toString() {
		return String.format("%.1f %.1f km/h %.1f%% %.1f km %s", temperature, wind, humidity, visibility, date);
	}
}
