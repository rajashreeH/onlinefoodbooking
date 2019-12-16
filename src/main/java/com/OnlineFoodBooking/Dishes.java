package com.OnlineFoodBooking;

public class Dishes {
	private int restaurantId;
	private String dishName;
	private double price;
	private double discount;
	public Dishes(int restaurantId, String dishName, double price, double discount) {
		super();
		this.restaurantId = restaurantId;
		this.dishName = dishName;
		this.price = price;
		this.discount = discount;
	}
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Dishes [restaurantId=" + restaurantId + ", dishName=" + dishName + ", price=" + price + ", discount="
				+ discount + "]";
	}
	

}
