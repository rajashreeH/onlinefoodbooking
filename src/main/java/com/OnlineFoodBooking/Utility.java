package com.OnlineFoodBooking;

import java.time.LocalTime;

public class Utility {
	private Utility() {}
	static OnlineFoodBookingDAO obj=new OnlineFoodBookingDAO();
	public static Dishes getDishes(String data) {
		String[] line=data.split(",");
		return new Dishes(Integer.parseInt(line[0]),line[1],Double.parseDouble(line[2]),Double.parseDouble(line[3]));
	}
	public static Restaurant getRestaurant(String data) {
		String[] line=data.split(",");
		return new Restaurant(Integer.parseInt(line[0]),line[1],Double.parseDouble(line[2]),LocalTime.of(Integer.parseInt(line[3].split(":")[0]), Integer.parseInt(line[3].split(":")[1]), Integer.parseInt(line[3].split(":")[2])),LocalTime.of((Integer.parseInt(line[4].split(":")[0])), Integer.parseInt(line[4].split(":")[1]), Integer.parseInt(line[4].split(":")[2])),obj.getReview(Integer.parseInt(line[0])),obj.getDishes(Integer.parseInt(line[0])));
	}
	public static Review getReview(String data) {
		String[] line=data.split(",");
		return new Review(Integer.parseInt(line[0]),line[1]);
	}
}
