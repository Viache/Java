package com.java.oop.figures;

public class Rhombus extends Shape {
	private int d1, d2;
	
	// формула для вычисления площади ромба S = 1/2 * d1 * d2;
	
	public Rhombus (int d1, int d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	
	@Override
	public double calcSquare() {
		double s = 0.5 * d1 * d2;
		return s;
	}
	
	@Override
	public String getName() {
		return "Rhombus";
	}
}
