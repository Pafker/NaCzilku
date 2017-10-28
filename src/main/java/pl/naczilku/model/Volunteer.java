package pl.naczilku.model;

public class Volunteer {

	private String firstName;

	private int telNumber;

	public Volunteer() {
	}

	public Volunteer(String firstName, int telNumber) {
		this.firstName = firstName;
		this.telNumber = telNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(int telNumber) {
		this.telNumber = telNumber;
	}

	@Override
	public String toString() {
		return "Volunteer [firstName=" + firstName + ", telNumber=" + telNumber
				+ "]";
	}

}
