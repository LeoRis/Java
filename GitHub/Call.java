package GitHub;

public class Call {
	private String caller;
	private String called;
	private int duration;
	
	public Call(String caller, String called, int duration) {
		this.caller = caller;
		this.called = called;
		this.duration = duration;
	}
	
	public void setCaller(String caller) {
		this.caller = caller;
	}
	
	public String getCaller() {
		return this.caller;
	}
	
	public void setCalled(String called) {
		this.called =called;
	}
	
	public String getCalled() {
		return this.called;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	@Override
	public String toString() {
		return "The longest call is from: " + this.caller + " to: " + this.called + " and lasted for: " + this.duration + " seconds.";
	}
	
}