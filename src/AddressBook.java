import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook() {
		this.buddies = new ArrayList<BuddyInfo>();
	}

	public void addBuddies(BuddyInfo n) {
		if(this.buddies != null) {
			this.buddies.add(n);
		}	
		return;
	}
	public void removeBuddies(BuddyInfo n) {
		this.buddies.remove(n);
		return;
	}
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Bob","112 street", "911");
		AddressBook book = new AddressBook();
		book.addBuddies(buddy);
		book.removeBuddies(buddy);
		
	}

}
