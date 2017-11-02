package pl.naczilku.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = { "id" })
public class Volunteer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	private String firstName;

	@NotBlank
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
