
public class BuddyInfo {
	private String name;
	private String address;
	private String number;
	
	public BuddyInfo(String name, String address, String number) {
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
	BuddyInfo buddy = new BuddyInfo("Marc", "113 sesame street","6135559292");
	System.out.println("Hello " + buddy.getName());

	}

}
