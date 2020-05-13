package com.java.oop.figures;

public class Rectangle extends Shape {
	
	private int x, y, w, h;

	/**
	 * Конструктор используется для инициализации полей класса x, y, w, h 
	 * 
	 * @param x - координата левого верхнего угла
	 * @param y - координата левого верхнего угла 
	 * @param w - ширина
	 * @param h - высота
	 */
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	/**
	 * Этот метод вычисляет площадь прямоугольника по следующей формуле S=w*h; 
	 */
	@Override
	public double calcSquare() {
		double s = w * h;
		return s;
	}

	/**
	 *  Этот метод возвращает название фигуры
	 */
	@Override
	public String getName() {
		return "Rectangle";
	}
}