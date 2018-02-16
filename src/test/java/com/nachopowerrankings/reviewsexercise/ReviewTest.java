package com.nachopowerrankings.reviewsexercise;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewTest {

	private static final Long ID = 1L;
	private static final String TITLE = "Test Review";
	private static final String IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flickr_jennerosity_3399911471--Nachos.jpg/220px-Flickr_jennerosity_3399911471--Nachos.jpg";
	private static final String CATEGORY = "Test";
	private static final String CONTENT = "This is a test review for a review site.";
	private static final String TLDR = "Testing Reviews";

	@Test
	public void shouldHaveAWorkingConstructorLongId() {
		Review underTest = new Review(ID, TITLE, IMAGE_URL, CATEGORY, CONTENT, TLDR);
		assertThat(underTest.getId(), is(ID));
		assertThat(underTest.getTitle(), is(TITLE));
		assertThat(underTest.getImageUrl(), is(IMAGE_URL));
		assertThat(underTest.getCategory(), is(CATEGORY));
		assertThat(underTest.getContent(), is(CONTENT));
		assertThat(underTest.getTldr(), is(TLDR));

	}
}