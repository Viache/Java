package com.java.trainschedule;

import java.util.List;
import java.util.Scanner;

import com.java.trainschedule.model.Train;
import com.java.trainschedule.service.TrainService;

public class TrainScheduleMain {
	public static void main(String[] args) {

		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);

		System.out.println("������ ����, ���� ���������� �����? ������� - ������� 1, ������ - ������� 2.");

		while (!scInt.hasNextInt()) {
			scInt.next();
			System.out.println("�� ��� �� ���� �� ��������� ������, ����� ��� ���. 1 - �������, 2 - ������.");
		}
		int ukrRus = scInt.nextInt();
		while (ukrRus < 1 || ukrRus > 2) {
			System.out.println("�������� ���� ����� �� ����� 1 � 2, ���������� ��� ���, 1 - �������, 2 - ������.");
			ukrRus = scInt.nextInt();
		}

		if (ukrRus == 1) {
			List<String> directionsByCity = TrainService.findDirectionsByCountry("�������");
			System.out.println("�� ������ ������ �������� " + directionsByCity.size() + " ����������� �� �������: ");
			for(String direction : directionsByCity) {
				System.out.println(direction);
			}
			System.out.println("�������.");
			String ukr = scString.nextLine();

			List<Train> trainList = TrainService.findTrainByCity(ukr);
			if (trainList == null) {
				System.out.println("�� ���������� ����, �������� ��� ���.");
			}
			System.out.println("���� " + trainList.size() + " �������� �������: ");
			for(Train train : trainList) {
				System.out.println(" �����: " + train.getCity() + " �����: " + train.getDepartureTime());
			}

			while (!scDouble.hasNextDouble()) {
				scDouble.next();
				System.out.println("���� �� ����������, �������� ��� ���.");
			}
			double hkTime = scDouble.nextDouble();

			
			Train train = TrainService.findTrainByTime(hkTime);
			if (train == null) {
				System.out.println("�� ���������� ����, �������� ��� ���.");
			}
			
			System.out.println("�� ��������� ����� �� " + train.getDepartureTime() + ". �������!");


		} else if (ukrRus == 2) {
			System.out.println("���������, ������, ������");
			String rus = scString.nextLine();
			if (rus.equals("���������")) {
				System.out.println("���� 3 �������� �������: 2.02, 11.45, 18.55");
			} else if (rus.equals("������")) {
				System.out.println("���� 3 �������� �������: 1.32, 10.33, 19.05");
			} else if (rus.equals("������")) {
				System.out.println("���� 3 �������� �������: 3.08, 9.55, 19.55");
			}
		}

	}

}
