package GitHub;

public interface Device {
	public void addContact(String newContact) throws OutOfMemoryError, IllegalArgumentException;
	public boolean isEmpty();
	public void delete();
	public int position(String contactName);
	public void switchContacts(int contactPosition, String name) throws IndexOutOfBoundsException, IllegalArgumentException;
}
