package com.java.oop.figures;

public class Triangle extends Shape {
	
	private int a, h;

	/**
	 * ����������� ������������ ��� ������������� ����� ������ a, h 
	 * 
	 * @param a - ��������� ������������
	 * @param h - ������ ������������
	 */
	public Triangle(int a, int h) {
		this.a = a;
		this.h = h;
	}

	/**
	 * ���� ����� ��������� ������� ������������ �� ��������� ������� S=1/2 *a*h; 
	 */
	@Override
	public double calcSquare() {
		double s = 0.5 * a * h;
		return s;
	}

	/**
	 *  ���� ����� ���������� �������� ������
	 */
	@Override
	public String getName() {
		return "Triangle";
	}

}
