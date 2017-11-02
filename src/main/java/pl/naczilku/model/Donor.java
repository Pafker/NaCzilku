package pl.naczilku.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Donor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	@NotBlank
	private boolean isLeader = false;

	@NotBlank
	private int telephoneNumber;

	public Donor() {
	}

	public Donor(Long id, String firstName, String lastName, boolean isLeader,
			int telephoneNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isLeader = isLeader;
		this.telephoneNumber = telephoneNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
