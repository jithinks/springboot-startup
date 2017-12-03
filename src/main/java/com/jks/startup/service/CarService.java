package com.jks.startup.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jks.startup.model.Car;

@Service
public class CarService {
	
	private List<Car> cars = new ArrayList<>(Arrays.asList(
			new Car("100","Camrey","Toyotta"),
			new Car("200","i10","Hundai")				
			));
	
	public List <Car> getAllCars (){
		return cars;
	}
	
	public Car getCar(String id){
		return cars.stream().filter(c -> c.getId().equals(id)).findFirst().get();
	}

	public void addCar(Car car) {
		cars.add(car);		
	}

	public void updateCar(Car car, String id) {
		for(int idx=0; idx < cars.size(); idx++){
			Car carsIterator =  cars.get(idx);
			if(carsIterator.getId().equals(id)){
				cars.set(idx, car);
				return;
			}
		}
		
	}

	public void deleteCar(String id) {
		cars.removeIf(c -> c.getId().equals(id));		
	}

}
