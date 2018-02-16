package com.nachopowerrankings.reviewsexercise;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {
	private static final Long REVIEW_ID = 1L;
	private static final String REVIEW_TITLE = "Test Review";
	private static final String REVIEW_IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flickr_jennerosity_3399911471--Nachos.jpg/220px-Flickr_jennerosity_3399911471--Nachos.jpg";
	private static final String REVIEW_CATEGORY = "Test";
	private static final String REVIEW_CONTENT = "This is a test review for a review site.";
	private static final String REVIEW_TLDR = "Testing Reviews";
	Review testReview = new Review(REVIEW_ID, REVIEW_TITLE, REVIEW_IMAGE_URL, REVIEW_CATEGORY, REVIEW_CONTENT,
			REVIEW_TLDR);
	Review testReview2 = new Review(2L, REVIEW_TITLE, REVIEW_IMAGE_URL, REVIEW_CATEGORY, REVIEW_CONTENT, REVIEW_TLDR);

	@Test
	public void shouldHaveAHashMapToStoreReviews() {
		ReviewRepository underTest = new ReviewRepository(testReview);
		int result = underTest.getSize();
		assertThat(result, is(1));
	}

	ReviewRepository underTest = new ReviewRepository(testReview, testReview2);

	@Test
	public void shouldStoreTwoReviews() {
		int result = underTest.getSize();
		assertThat(result, is(2));
	}

	@Test
	public void shouldReturnCollectionOfReviews() {
		Collection result = underTest.getReviews();
		assertThat(result.contains(testReview), is(true));
	}

	@Test
	public void shouldReturnReviewById() {
		Review result = underTest.getReview(REVIEW_ID);
		assertThat(result.getContent(), is(REVIEW_CONTENT));
	}
}
