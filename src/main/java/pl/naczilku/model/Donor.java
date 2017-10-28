package pl.naczilku.model;

public class Donor {

	private int id;

	private String firstName;

	private String lastName;

	private boolean isLeader;

	private int telephoneNumber;

	public Donor() {
	}

	public Donor(int id, String firstName, String lastName, boolean isLeader,
			int telephoneNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isLeader = isLeader;
		this.telephoneNumber = telephoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isLeader() {
		return isLeader;
	}

	public void setLeader(boolean isLeader) {
		this.isLeader = isLeader;
	}

	public int getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	@Override
	public String toString() {
		return "Donor [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", isLeader=" + isLeader + ", telephoneNumber="
				+ telephoneNumber + "]";
	}

}
