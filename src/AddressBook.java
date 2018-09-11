import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook() {
		this.buddies=null;
	}

	public void addBuddies(BuddyInfo n) {
		this.buddies.add(n);
		return;
	}
	public void removeBuddies(BuddyInfo n) {
		this.buddies.remove(n);
		return;
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");

	}

}
