import java.util.ArrayList;

public class AddressBook {
	private static ArrayList<BuddyInfo> buddies;
	
	public AddressBook() {
		buddies = new ArrayList<BuddyInfo>();
	}

	public static void addBuddies(BuddyInfo n) {
		buddies.add(n);
		return;
	}
	public static void removeBuddies(BuddyInfo n) {
		buddies.remove(n);
		return;
	}
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Bob","112 street", "911");
		AddressBook book = new AddressBook();
		book.addBuddies(buddy);
		book.removeBuddies(buddy);
		System.out.println("Address Book");

	}

}
