package com.OnlineFoodBooking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlineFoodBookingDAO implements OnlineFoodBooking {
	Logger logger = LoggerFactory.getLogger(OnlineFoodBookingDAO.class);
	Path restPath = Paths.get("src//data//Restaurant.txt");

	public List<Review> getReview(int restaurantID) {
		logger.info("Inside getReview() Method");
		List<Review> fileData = new ArrayList<>();
		try {
			fileData = Files.lines(Paths.get("src//data//Review.txt")).map(Utility::getReview)
					.collect(Collectors.toList()).stream().filter(f -> f.getReviewId() == restaurantID)
					.collect(Collectors.toList());

		} catch (IOException e) {
			logger.info(e.getMessage());
		}
		return fileData;
	}

	public List<Dishes> getDishes(int restaurantID) {
		logger.info("Inside getDishes() Method");
		List<Dishes> fileData = new ArrayList<>();
		try {
			fileData = Files.lines(Paths.get("src//data//Dishes.txt")).map(Utility::getDishes)
					.collect(Collectors.toList()).stream().filter(f -> f.getRestaurantId() == restaurantID)
					.collect(Collectors.toList());

		} catch (IOException e) {
			logger.info(e.getMessage());
		}
		return fileData;
	}

	public List<Restaurant> getAllRestaurant() {
		logger.info("Inside getAllRestaurant() Method");
		List<Restaurant> fileData = new ArrayList<>();
		try {
			fileData = Files.lines(restPath).map(Utility::getRestaurant).collect(Collectors.toList());

		} catch (IOException e) {
			logger.info(e.getMessage());
		}
		return fileData;
	}

	public List<Restaurant> filterRestaurantBasedOnRating() {
		logger.info("Inside filterRestaurantBasedOnRating() Method");
		List<Restaurant> fileData = new ArrayList<>();
		try {
			fileData = Files.lines(restPath).map(Utility::getRestaurant).collect(Collectors.toList()).stream()
					.filter(r -> r.getRating() < 4).collect(Collectors.toList());

		} catch (IOException e) {
			logger.info(e.getMessage());
		}
		return fileData;
	}

	public List<Restaurant> getAllRestaurantAvailability() {
		logger.info("Inside getAllRestaurantAvailability() Method");
		List<Restaurant> fileData = new ArrayList<>();
		try {
			fileData = Files.lines(restPath).map(Utility::getRestaurant).collect(Collectors.toList()).stream().filter(
					r -> r.getOpeningTime().isBefore(LocalTime.now()) || r.getClosingTime().isAfter(LocalTime.now()))
					.collect(Collectors.toList());

		} catch (IOException e) {
			logger.info(e.getMessage());
		}
		return fileData;
	}

}
