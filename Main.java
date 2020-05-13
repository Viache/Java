package com.java.oop.figures;

public class Main {
	public static void main(String[] args) {
		// ������� ������ �� ���� ����� ����, �������������, �����������
		Shape[] shapes = { new Circle(10, 20, 30), new Rectangle(20, 30, 40, 50) , new Triangle(20, 15) };
		
		// ����� ���������� �� ������� ������� �������� ������ � ��������� ������� ������
		for (int i = 0; i < shapes.length; i++) {
			String name = shapes[i].getName();
			double square = shapes[i].calcSquare();
			
			// ������� �������� ������ � �������� �������
			System.err.println("Figure " + name + " has square = " + square);
		}
	}
}
