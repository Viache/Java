package com.java.oop.figures;

public class Parallelogram extends Shape{
	
	private int b, c;
	
	/**
	 *  онструктор используетс€ дл€ инициализации полей класса b и с 
	 * 
	 * @param a - основание параллелограмма 
	 * @param h - высота параллелограмма
	 */
	
	public Parallelogram (int b, int c) {
		this.b = b;
		this.c = c;
	}
		
	/**
	 * Ётот метод расчтывает площадь параллелограмма. 
	 * ‘ормула дл€ вычислени€ площади параллелограмма имеет следующий вид:  S = b * c;
	 */
	
		@Override
		public double calcSquare() {
			double s = b * c;
			return s;
		}
		
		/**
		 *  Ётот метод возвращает название фигуры
		 */
		
		@Override
		public String getName() {
			return "Parallelogram";
		}
	}


