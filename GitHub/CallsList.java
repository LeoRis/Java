package GitHub;

public interface CallsList {
	public void talked(Call call) throws OutOfMemoryError;
	public void increaseCapacity(int capacity);
	public Call longestCall();
}
