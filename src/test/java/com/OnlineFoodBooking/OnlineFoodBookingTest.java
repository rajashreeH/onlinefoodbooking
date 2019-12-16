package com.OnlineFoodBooking;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OnlineFoodBookingTest {

	Logger logger = LoggerFactory.getLogger(OnlineFoodBookingTest.class);
	OnlineFoodBookingDAO realfoodBooking = new OnlineFoodBookingDAO();
	OnlineFoodBookingDAO mockfoodBooking = mock(OnlineFoodBookingDAO.class);

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	
	@Before
	public void setUp() throws Exception {
		logger.info("Before All Test Case");
	}

	@After
	public void tearDown() throws Exception {
		logger.info("After All Test Case");
	}

	@Test
	public void testGetAllRestaurant() {
		List<Restaurant> expected = Arrays.asList(
				new Restaurant(111, "Truffles", 4.5, LocalTime.of(9, 00, 01), LocalTime.of(05, 00, 9),
						realfoodBooking.getReview(111), realfoodBooking.getDishes(111)),
				new Restaurant(222, "Haldiram", 2.3, LocalTime.of(9, 00, 01), LocalTime.of(05, 00, 9),
						realfoodBooking.getReview(222), realfoodBooking.getDishes(222)),
				new Restaurant(333, "McDonald", 4.5, LocalTime.of(10, 00, 01), LocalTime.of(21, 00, 9),
						realfoodBooking.getReview(333), realfoodBooking.getDishes(333)));
		assertEquals(expected.toString(), realfoodBooking.getAllRestaurant().toString());
	}

	@Test
	public void testFilterRestaurantBasedOnRating() {
		List<Restaurant> expected = Arrays.asList(new Restaurant(222, "Haldiram", 2.3, LocalTime.of(9, 00, 01),
				LocalTime.of(05, 00, 9), realfoodBooking.getReview(222), realfoodBooking.getDishes(222)));
		assertEquals(expected.toString(), realfoodBooking.filterRestaurantBasedOnRating().toString());
	}

	@Test
	public void testGetAllRestaurantAvailability() {
		assertEquals(mockfoodBooking.getAllRestaurantAvailability(), mockfoodBooking.getAllRestaurantAvailability());
	}

	@Test
	public void testGetReview() {
		when(mockfoodBooking.getReview(111)).thenReturn(
				Arrays.asList(new Review(111, "This not a good restaurant"), new Review(111, "Best Restaurant")));
		List<Review> expected = Arrays.asList(new Review(111, "This not a good restaurant"),
				new Review(111, "Best Restaurant"));
		assertEquals(expected.toString(), mockfoodBooking.getReview(111).toString());
	}

	@Test
	public void testGetDishes() {
		when(mockfoodBooking.getDishes(111)).thenReturn(
				Arrays.asList(new Dishes(111, "Veg Pulao", 250.0, 26.0), new Dishes(111, "Matar Paneer", 220.0, 25.0)));
		List<Dishes> expected = Arrays.asList(new Dishes(111, "Veg Pulao", 250.0, 26.0),
				new Dishes(111, "Matar Paneer", 220.0, 25.0));
		assertEquals(expected.toString(), mockfoodBooking.getDishes(111).toString());
	}


}
