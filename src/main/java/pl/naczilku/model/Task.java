package pl.naczilku.model;

import java.time.LocalDateTime;

public class Task {

	// ubrania, zywnosc, higiena i leki, inne
	private String category;

	private String productName;

	private String comment;

	private boolean isFinished;

	private Donor whoDonated;

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
