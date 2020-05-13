package com.java.oop.figures;

public class Triangle extends Shape {
	
	private int a, h;

	/**
	 * Конструктор используется для инициализации полей класса a, h 
	 * 
	 * @param a - основание треугольника
	 * @param h - высота треугольника
	 */
	public Triangle(int a, int h) {
		this.a = a;
		this.h = h;
	}

	/**
	 * Этот метод вычисляет площадь треугольника по следующей формуле S=1/2 *a*h; 
	 */
	@Override
	public double calcSquare() {
		double s = 0.5 * a * h;
		return s;
	}

	/**
	 *  Этот метод возвращает название фигуры
	 */
	@Override
	public String getName() {
		return "Triangle";
	}

}
