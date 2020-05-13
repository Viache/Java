package com.java.oop.figures;

public class Circle extends Shape {

	private int x, y, r;

	/**
	 * Конструктор используется для инициализации полей класса x, y, r 
	 * 
	 * @param x - координата x точки центра круга
	 * @param y - координата y точки центра круга
	 * @param r - радиус
	 */
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	/**
	 * Этот метод вычисляет площадь круга по следующей формуле S=Pi*R^2; 
	 */
	@Override
	public double calcSquare() {
		double result = 3.14 * (r*r);
		return result;
	}

	/**
	 *  Этот метод возвращает название фигуры
	 */
	@Override
	public String getName() {
		return "Circle";
	}
}
