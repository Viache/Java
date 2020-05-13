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

		System.out.println("Добрый день, куда планируете ехать? Украина - нажмите 1, Россия - нажмите 2.");

		while (!scInt.hasNextInt()) {
			scInt.next();
			System.out.println("То что ты ввел не являеться числом, введи еще раз. 1 - Украина, 2 - Россия.");
		}
		int ukrRus = scInt.nextInt();
		while (ukrRus < 1 || ukrRus > 2) {
			System.out.println("Введённое вами число не равно 1 и 2, попробуйте еще раз, 1 - Украина, 2 - Россия.");
			ukrRus = scInt.nextInt();
		}

		if (ukrRus == 1) {
			List<String> directionsByCity = TrainService.findDirectionsByCountry("Украина");
			System.out.println("На данный момент доступно " + directionsByCity.size() + " направления по Украине: ");
			for(String direction : directionsByCity) {
				System.out.println(direction);
			}
			System.out.println("Выбирай.");
			String ukr = scString.nextLine();

			List<Train> trainList = TrainService.findTrainByCity(ukr);
			if (trainList == null) {
				System.out.println("Не корректный ввод, попробуй еще раз.");
			}
			System.out.println("Есть " + trainList.size() + " варианта времени: ");
			for(Train train : trainList) {
				System.out.println(" Город: " + train.getCity() + " время: " + train.getDepartureTime());
			}

			while (!scDouble.hasNextDouble()) {
				scDouble.next();
				System.out.println("Ввод не корректный, попробуй еще раз.");
			}
			double hkTime = scDouble.nextDouble();

			
			Train train = TrainService.findTrainByTime(hkTime);
			if (train == null) {
				System.out.println("Не корректный ввод, попробуй еще раз.");
			}
			
			System.out.println("Вы преобрели билет на " + train.getDepartureTime() + ". Спасибо!");


		} else if (ukrRus == 2) {
			System.out.println("Хабаровск, Москва, Ростов");
			String rus = scString.nextLine();
			if (rus.equals("Хабаровск")) {
				System.out.println("Есть 3 варианта времени: 2.02, 11.45, 18.55");
			} else if (rus.equals("Москва")) {
				System.out.println("Есть 3 варианта времени: 1.32, 10.33, 19.05");
			} else if (rus.equals("Ростов")) {
				System.out.println("Есть 3 варианта времени: 3.08, 9.55, 19.55");
			}
		}

	}

}
