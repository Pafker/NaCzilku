package pl.naczilku.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "id" })
public class Volunteer {

	private Long id;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Volunteer [firstName=" + firstName + ", telNumber=" + telNumber
				+ "]";
	}

}
