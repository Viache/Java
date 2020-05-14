package com.java.oop.figures;

public class Foursquare extends Shape {
	private int x;
	
	public Foursquare (int x) {
		this.x = x;
	}
	
	@Override
	public double calcSquare() {
		double s = x * x;
		return s;
	}
	
	@Override
	public String getName() {
		return "foursquare";
	}
}
