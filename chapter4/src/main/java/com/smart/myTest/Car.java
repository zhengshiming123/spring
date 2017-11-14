package com.smart.myTest;

public class Car {
	private String brand;

	private String color;

	private int maxSpeed;
	private String iDCode;

	public String getiDCode() {
		return iDCode;
	}


	public void setiDCode(String iDCode) {
		this.iDCode = iDCode;
	}


	public Car(){System.out.println("init car!!");}


	public Car(String brand, String color, int maxSpeed){
		this.brand = brand;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public void introduce() {
       System.out.println("brand:"+brand+";color:"+color+";maxSpeed:"+maxSpeed);
		System.out.println("iDCode"+iDCode);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
