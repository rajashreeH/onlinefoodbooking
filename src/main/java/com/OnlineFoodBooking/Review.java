package com.OnlineFoodBooking;

public class Review {
	private int reviewId;
	String customerReview;
	private String[] reviews;

	public Review(int reviewId, String review) {
		super();
		this.reviewId = reviewId;
		this.customerReview = review;
	}

	public String getReview() {
		return customerReview;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public void setReview(String review) {
		this.customerReview = review;
	}

	public String[] getReviews() {
		return reviews;
	}

	public void setReviews(String[] reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", review=" + customerReview + "]";
	}

}
