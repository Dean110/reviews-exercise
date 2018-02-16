package com.nachopowerrankings.reviewsexercise;

import java.util.Collection;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {
	private HashMap<Long, Review> reviews = new HashMap<>();

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

	public Review getReview(Long key) {
		return reviews.get(key);
	}

	public int getSize() {
		return reviews.size();
	}

	public Collection getReviews() {
		// TODO Auto-generated method stub
		return reviews.values();
	}

}
