package com.filmbite.cloud.controller;

import com.filmbite.cloud.data.Review;
import com.filmbite.cloud.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/filmbite")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/reviews/add")
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        return ResponseEntity.ok(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")));
    }
}
