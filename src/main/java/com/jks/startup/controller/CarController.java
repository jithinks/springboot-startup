/*
package com.jks.startup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jks.startup.model.Car;
import com.jks.startup.service.CarRepositoryService;

@RestController
public class CarController {
	
	*/
/*** CarRepositoryService - For Derby JPA **//*

	
	@Autowired
	private CarRepositoryService carRepositoryService;
	
	@RequestMapping ("/cars")
	public List<Car> getAllCars(){
		return carRepositoryService.getAllCars();
	}  
	
	
	@RequestMapping ("/cars")
	public List<Car> getCarByModel(@PathVariable String id){
		return carRepositoryService.getCarByModel(id);
	} 
			
	@RequestMapping ("/cars/{id}")
	public Car getCar(@PathVariable String id){
		return carRepositoryService.getCar(id);
	}
	
	
	
	@RequestMapping(value="/cars", method = RequestMethod.POST)
	public void addCar (@RequestBody Car car){
		carRepositoryService.addCar(car);
	}
	
	@RequestMapping(value="/cars/{id}", method = RequestMethod.PUT)
	public void updateCar(@RequestBody Car car, @PathVariable String id){
		carRepositoryService.updateCar(car);
	}
	
	@RequestMapping(value="/cars/{id}", method = RequestMethod.DELETE)
	public void deleteCar(@PathVariable String id){
		carRepositoryService.deleteCar(id);
	}
	
	*/
/*** CarService - For in memory **//*

	
	*/
/*@Autowired
	private CarService carService;
	
	@RequestMapping ("/cars")
	public List<Car> getAllCars(){
		return carService.getAllCars();
	}  
	
	@RequestMapping ("/cars/{id}")
	public Car getCar(@PathVariable String id){
		return carService.getCar(id);
	}
	
	
	@RequestMapping(value="/cars", method = RequestMethod.POST)
	public void addCar (@RequestBody Car car){
		carService.addCar(car);
	}
	
	@RequestMapping(value="/cars/{id}", method = RequestMethod.PUT)
	public void updateCar(@RequestBody Car car, @PathVariable String id){
		carService.updateCar(car, id);
	}
	
	@RequestMapping(value="/cars/{id}", method = RequestMethod.DELETE)
	public void deleteCar(@PathVariable String id){
		carService.deleteCar(id);
	}*//*

}
*/
