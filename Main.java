package com.java.oop.figures;

public class Main {
	public static void main(String[] args) {
		// Создаем массив из трех фигур Круг, Прямоугольник, Треугольник
		Shape[] shapes = { new Circle(10, 20, 30), new Rectangle(20, 30, 40, 50) , new Triangle(20, 15) };
		
		// Далее проходимся по массиву выводим название фигуры и вычисляем площадь фигуры
		for (int i = 0; i < shapes.length; i++) {
			String name = shapes[i].getName();
			double square = shapes[i].calcSquare();
			
			// Выводим название фигуры и значение площади
			System.err.println("Figure " + name + " has square = " + square);
		}
	}
}
