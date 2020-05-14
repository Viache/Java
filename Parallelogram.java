package com.java.oop.figures;

public class Parallelogram extends Shape{
	
	private int b, c;
	
	/**
	 * ����������� ������������ ��� ������������� ����� ������ b � � 
	 * 
	 * @param a - ��������� ��������������� 
	 * @param h - ������ ���������������
	 */
	
	public Parallelogram (int b, int c) {
		this.b = b;
		this.c = c;
	}
		
	/**
	 * ���� ����� ���������� ������� ���������������. 
	 * ������� ��� ���������� ������� ��������������� ����� ��������� ���:  S = b * c;
	 */
	
		@Override
		public double calcSquare() {
			double s = b * c;
			return s;
		}
		
		/**
		 *  ���� ����� ���������� �������� ������
		 */
		
		@Override
		public String getName() {
			return "Parallelogram";
		}
	}


