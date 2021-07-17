package GitHub;

public interface List {

	public int nrSamePositions();
	public void pass(Trail trail) throws OutOfMemoryError;
	public void newTrails(int capacity);
}
