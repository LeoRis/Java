	package GitHub;

public interface Array {
	public void change(int x, int y) throws IndexOutOfBoundsException;
	public void add(int x) throws OutOfMemoryError;
	public void delete();
	public boolean isEmpty();
	public int size();
	public int indexOf(int x);
	public int readElement(int x) throws IndexOutOfBoundsException;
}
