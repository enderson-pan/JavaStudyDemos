package com.holytiny.iocdemo;

public class CarRunner {
	public CarRunner(Car car) {
		brand_ = car.brand();
	}
	
	public String info() {
		return brand_;
	}
	
	private String brand_;
}
