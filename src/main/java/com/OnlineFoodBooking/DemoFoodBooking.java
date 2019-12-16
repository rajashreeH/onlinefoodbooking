package com.OnlineFoodBooking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoFoodBooking {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Restaurant.class);
		OnlineFoodBookingDAO obj = new OnlineFoodBookingDAO();

		logger.debug("Calling getAllRestaurant() method in Main Class");
		obj.getAllRestaurant().forEach(System.out::println);
		logger.error("Calling filterRestaurantBasedOnRating() method in Main Class");
		obj.filterRestaurantBasedOnRating().forEach(System.out::println);
		logger.trace("Calling getAllRestaurantAvailability() method in Main Class");
		obj.getAllRestaurantAvailability().forEach(System.out::println);

	}
}
