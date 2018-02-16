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

	public ReviewRepository() {
		Review tacoBellNachosSupreme = new Review(100L, "Taco Bell Nachos Supreme", "/images/NachosSupreme.jpg",
				"Fast Food",
				"This is the nickel of the nacho world, ubiquitous, yet not really necessary. However, it does provide a stable baseline that other nachos have to acheive to be considered nachos. The chips are fresh with a crunch and adequete saltiness.  The nacho cheese is the goold standard for fast food cheese sauce, creamy, hot, and smooth in a way that only processed cheese can achieve.  Toppings are minimal, but they work to add value to the dish. The taco beef is classic, sour cream and tomatoes add a coolness that helps contrast the sharpness of the cheese sauce, but the refried beans often miss the mark being too clumpy most of the time.",
				"A baseline C, better than not having nachos.");
		Review tacoBellNachosBellGrande = new Review(101L, "Taco Bell Nachos Supreme", "/images/NachosBellGrande.jpg",
				"Fast Food",
				"Taco Bell's premium nachos offering is a larger version of their Nachos Supreme. There is nothing to seperate it from it's smaller brethern. This isn't a bad thing. As we described in our review of the Nachos Supreme, the ingredients used are adequete, but nothing makes the Nachos Bell Grande stand out from the rest.",
				"A bigger version of the Nachos Supreme");
		Review wikipediaNachos = new Review(102L, "Wikipedia Nachos", "/images/wikiNachosSupreme.jpg", "Home Made",
				"This version of nachos is why you can't use wikipedia as a research source on academic papers. The chips are store bought, not a problem for home made nachos, but the arrangement is bush league and reeks of a no talent nacho clown trying to make a fancy plate for Pinterest. The cheese is frightning, it appears to have the surface tension of grade school children's slime. Slivers of onions convey a sense of true laziness in the preparer.  And finally, the coup de grâce of the entire dish are the whole olives. Adding no value of their own, the only purpose they serve is as a warning that noone should give this dish the time of day.",
				"A strict F-");
		Review bakersNachos = new Review(103L, "Baker's Pulled Pork Nachos", "/images/bakersNachos.jpg", "Restaurant",
				"Baker's delivers hugely on their nachos! With quality ingredients and a portion size that places them on the all time greats list of value for your dollar. The cheese is melted evenly over the house made chips. The pulled pork is sweet and tangy and shredded in a way that it can be broken up onto each chip. The lettuce can be an uneven cut, but it's not enough to distract you from the greatness of the dish.  Salsa is served on the side, which is smart because of the amount of good stuff going on with the other toppings.  It lets the consumer use the salsa for the random chips that don't have as many toppings as the others.",
				"Greater than the sum of its parts, a solid A");
		Review smokeyBonesNachos = new Review(104L, "Smokey Bones \'The Manchego\'", "/images/smokeyBonesNachos.jpg",
				"Restaurant",
				"Smokey Bones reaches for the brass ring with \'The Manchego\' and almost gets there. The chips are sometimes a little sketchy, with previous visits yielding chips that were stale.  However, most of the times I've had this dish they have been excellent. The combination of cheese sauce and shredded cheese to the dish provides a depth of flavor in the cheese category. Pulled pork and shredded chicken are both excellent and combine with the other fresh toppings to provide the quintessintial American nacho experience.",
				"Classic American offering, B+");
		reviews.put(tacoBellNachosSupreme.getId(), tacoBellNachosSupreme);
		reviews.put(tacoBellNachosBellGrande.getId(), tacoBellNachosBellGrande);
		reviews.put(wikipediaNachos.getId(), wikipediaNachos);
		reviews.put(bakersNachos.getId(), bakersNachos);
		reviews.put(smokeyBonesNachos.getId(), smokeyBonesNachos);
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
		return reviews.values();
	}

}
