class user {
	private int mobileNumber;
	private String name;

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class EncapsulationExample2 {

	public static void main(String[] args) {

		user use = new user();
		use.setName("suraj darekar");
		use.setMobileNumber(8805535);
		System.out.println(use.getMobileNumber());
		System.out.println(use.getName());
	}

}
