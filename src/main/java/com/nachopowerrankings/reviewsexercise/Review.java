package com.nachopowerrankings.reviewsexercise;

public class Review {

	private Long id;
	private String title;
	private String imageUrl;
	private String category;
	private String content;
	private String tldr;

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getTldr() {
		return tldr;
	}

	public Review(Long id, String title, String imageUrl, String category, String content, String tldr) {

		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;
		this.tldr = tldr;
	}

}
