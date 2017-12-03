package com.jks.startup.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jks.startup.dao.CarRepository;
import com.jks.startup.model.Car;

@Service
public class CarRepositoryService {

	@Autowired
	private CarRepository carRepository;
	
	public List<Car> getAllCars (){
		List<Car> cars = new ArrayList<>();
		carRepository.findAll()
		.forEach(cars :: add);
		
		return cars;
	}
	
	public List<Car> getCarByModel(String id){
		return carRepository.findByModelName(id);
	}
	
	
	public Car getCar(String id){
		return carRepository.findOne(id);
	}
	
	public void addCar(Car car) {
		carRepository.save(car)	;
	}
	
	public void updateCar (Car car){
		carRepository.save(car);
	}
	
	public void deleteCar (String id){
		carRepository.delete(id);
	}
}
