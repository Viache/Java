package com.java.oop.figures;

public class Rectangle extends Shape {
	
	private int x, y, w, h;

	/**
	 * ����������� ������������ ��� ������������� ����� ������ x, y, w, h 
	 * 
	 * @param x - ���������� ������ �������� ����
	 * @param y - ���������� ������ �������� ���� 
	 * @param w - ������
	 * @param h - ������
	 */
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	/**
	 * ���� ����� ��������� ������� �������������� �� ��������� ������� S=w*h; 
	 */
	@Override
	public double calcSquare() {
		double s = w * h;
		return s;
	}

	/**
	 *  ���� ����� ���������� �������� ������
	 */
	@Override
	public String getName() {
		return "Rectangle";
	}
}