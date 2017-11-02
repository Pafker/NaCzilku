package pl.naczilku.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	// ubrania, zywnosc, higiena i leki, inne
	@NotBlank
	private String category;

	@NotBlank
	private String productName;

	@NotBlank
	private String comment;

	@NotBlank
	private boolean isFinished;

	@OneToOne
	private Donor whoDonated;

	@NotBlank
	private LocalDateTime donationTime;

	public Task() {
	}

	public Task(String category, String productName, String comment,
			boolean isFinished, Donor whoDonated, LocalDateTime donationTime) {
		this.category = category;
		this.productName = productName;
		this.comment = comment;
		this.isFinished = isFinished;
		this.whoDonated = whoDonated;
		this.donationTime = donationTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Donor getWhoDonated() {
		return whoDonated;
	}

	public void setWhoDonated(Donor whoDonated) {
		this.whoDonated = whoDonated;
	}

	public LocalDateTime getDonationTime() {
		return donationTime;
	}

	public void setDonationTime(LocalDateTime donationTime) {
		this.donationTime = donationTime;
	}

	@Override
	public String toString() {
		return "Task [category=" + category + ", productName=" + productName
				+ ", comment=" + comment + ", isFinished=" + isFinished
				+ ", whoDonated=" + whoDonated + ", donationTime="
				+ donationTime + "]";
	}

}
