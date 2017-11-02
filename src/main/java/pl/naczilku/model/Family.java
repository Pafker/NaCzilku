package pl.naczilku.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Family {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	private String lastName;

	@NotBlank
	private int numOfMembers;

	@NotBlank
	private String voivodeship;

	@NotBlank
	private String region;

	@NotBlank
	private String street;

	@OneToOne
	private Volunteer volunteer;

	@OneToMany
	private List<Donor> donorList;

	// 0: isChild
	// 1: isStudent
	// 2: isPensioner
	// 0 for false, 1 for true
	// Example family with student and pensioner: [0 1 1]
	@NotBlank
	private int[] familyStatus = new int[3];

	@NotBlank
	private boolean isFinished;

	@NotBlank
	private String description;

	@OneToMany
	private List<Task> taskList;

	public Family() {
	}

	public Family(Long id, String lastName, int numOfMembers,
			String woivoiship, String region, String street,
			Volunteer volunteer, List<Donor> donorList, int[] familyStatus,
			boolean isFinished, String description, List<Task> taskList) {
		this.id = id;
		this.lastName = lastName;
		this.numOfMembers = numOfMembers;
		this.voivodeship = woivoiship;
		this.region = region;
		this.street = street;
		this.volunteer = volunteer;
		this.donorList = donorList;
		this.familyStatus = familyStatus;
		this.isFinished = isFinished;
		this.description = description;
		this.taskList = taskList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumOfMembers() {
		return numOfMembers;
	}

	public void setNumOfMembers(int numOfMembers) {
		this.numOfMembers = numOfMembers;
	}

	public String getVoivodeship() {
		return voivodeship;
	}

	public void setVoivodeship(String voivodeship) {
		this.voivodeship = voivodeship;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Volunteer getVolunteer() {
		return volunteer;
	}

	public void setVolunteer(Volunteer volunteer) {
		this.volunteer = volunteer;
	}

	public List<Donor> getDonor() {
		return donorList;
	}

	public void setDonor(List<Donor> donorList) {
		this.donorList = donorList;
	}

	public int[] getFamilyStatus() {
		return familyStatus;
	}

	public void setFamilyStatus(int[] familyStatus) {
		this.familyStatus = familyStatus;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	@Override
	public String toString() {
		return "Family [id=" + id + ", lastName=" + lastName
				+ ", numOfMembers=" + numOfMembers + ", voivodeship="
				+ voivodeship + ", region=" + region + ", street=" + street
				+ ", volunteer=" + volunteer + ", donorList=" + donorList
				+ ", familyStatus=" + Arrays.toString(familyStatus)
				+ ", isFinished=" + isFinished + ", description=" + description
				+ ", taskList=" + taskList + "]";
	}

	public void addTask(Task tempTask) {
		if (taskList == null) {
			taskList = new ArrayList<Task>();
		}
		taskList.add(tempTask);
	}

	public void addDonor(Donor tempDonor) {
		if (donorList == null) {
			donorList = new ArrayList<Donor>();
		}
		donorList.add(tempDonor);
	}

}
