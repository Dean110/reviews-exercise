package com.nachopowerrankings.reviewsexercise;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {
	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("reviews")
	public String getAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.getReviews());
		return "reviews";
	}

	@RequestMapping("review")
	public String getAReview(@RequestParam Long id, Model model) {
		model.addAttribute("reviews", reviewRepo.getReview(id));
		return "review";
	}
}
