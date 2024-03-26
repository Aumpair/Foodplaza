package com.foodplaza.pojo;

public class Feedback {
	private String name;
	private String emailid;
	private int rank;
	private String review;
	private String suggestion;
	
	public Feedback() {
		super();
	}
	public Feedback(String name, String emailid, int rank, String review, String suggestion) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.rank = rank;
		this.review = review;
		this.suggestion = suggestion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getSuggestion() {
		return suggestion;
	}
	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	@Override
	public String toString() {
		return "Feedback [name=" + name + ", emailid=" + emailid + ", rank=" + rank + ", review=" + review
				+ ", suggestion=" + suggestion + "]";
	}
	
}
