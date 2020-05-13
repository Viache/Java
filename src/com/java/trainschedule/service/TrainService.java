package com.java.trainschedule.service;

import java.util.ArrayList;
import java.util.List;

import com.java.trainschedule.model.Train;

public class TrainService {
	
	public static List<Train> receiveTrainList() {
		
		List<Train> list = new ArrayList<Train>();
		Train train = new Train();
		train.setTrainNumber(1);
		train.setCountry("”краина");
		train.setCity("’арьков");
		train.setDepartureTime("12:23");
		
		list.add(train);
		
		train = new Train();
		train.setTrainNumber(2);
		train.setCountry("”краина");
		train.setCity("’арьков");
		train.setDepartureTime("23:56");
		
		list.add(train);
		
		train = new Train();
		train.setTrainNumber(3);
		train.setCountry("”краина");
		train.setCity(" иев");
		train.setDepartureTime("6:44");
		
		list.add(train);
		
		train = new Train();
		train.setTrainNumber(4);
		train.setCountry("”краина");
		train.setCity(" иев");
		train.setDepartureTime("11:53");
		
		list.add(train);
		
		train = new Train();
		train.setTrainNumber(5);
		train.setCountry("”краина");
		train.setCity(" иев");
		train.setDepartureTime("23:26");
		
		list.add(train);
		
		train = new Train();
		train.setTrainNumber(8);
		train.setCountry("”краина");
		train.setCity("ќдесса");
		train.setDepartureTime("13:53");
		
		list.add(train);
		
		train = new Train();
		train.setTrainNumber(9);
		train.setCountry("”краина");
		train.setCity("ќдесса");
		train.setDepartureTime("3:26");
		
		list.add(train);
		  
		
		return list;
	}
	
	public static List<String> findDirectionsByCountry(String country) {
		
		List<String> directionsByCountry = new ArrayList(); 
		List<Train> list = TrainService.receiveTrainList();
		for(Train train : list) {
			if (country.equalsIgnoreCase(train.getCountry())) {
				if (!directionsByCountry.contains(train.getCity())) {
					directionsByCountry.add(train.getCity());
				}
			}
		}
		return directionsByCountry;
	}
	
	public static List<Train> findTrainByCountry(String country) {
		
		List<Train> trainsByCountry = new ArrayList(); 
		List<Train> list = TrainService.receiveTrainList();
		for(Train train : list) {
			if (country.equalsIgnoreCase(train.getCountry())) {
				trainsByCountry.add(train);
			}
		}
		return trainsByCountry;
	}
	
	public static List<Train> findTrainByCity(String city) {
		
		List<Train> trainsByCity = new ArrayList(); 
		List<Train> list = TrainService.receiveTrainList();
		for(Train train : list) {
			if (city.equalsIgnoreCase(train.getCity())) {
				trainsByCity.add(train);
			}
		}
		return trainsByCity;
	}
	
	public static Train findTrainByTime(double time) {
		
		Train trainByTime = new Train(); 
		List<Train> list = TrainService.receiveTrainList();
		for(Train train : list) {
			if (String.valueOf(time).replace(".", ":").equalsIgnoreCase(train.getDepartureTime())) {
				trainByTime = train;
				break;
			}
		}
		return trainByTime;
	}

}
