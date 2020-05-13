package com.java.oop.figures;

public class Circle extends Shape {

	private int x, y, r;

	/**
	 * ����������� ������������ ��� ������������� ����� ������ x, y, r 
	 * 
	 * @param x - ���������� x ����� ������ �����
	 * @param y - ���������� y ����� ������ �����
	 * @param r - ������
	 */
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	/**
	 * ���� ����� ��������� ������� ����� �� ��������� ������� S=Pi*R^2; 
	 */
	@Override
	public double calcSquare() {
		double result = 3.14 * (r*r);
		return result;
	}

	/**
	 *  ���� ����� ���������� �������� ������
	 */
	@Override
	public String getName() {
		return "Circle";
	}
}
