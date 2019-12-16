package com.OnlineFoodBooking;

import java.util.List;

public interface OnlineFoodBooking {

	public List<Restaurant> getAllRestaurant();
	public List<Restaurant> filterRestaurantBasedOnRating();
	public List<Restaurant> getAllRestaurantAvailability();
}
