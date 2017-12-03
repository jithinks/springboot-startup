package com.jks.startup.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jks.startup.model.Car;


public interface CarRepository extends CrudRepository<Car, String>{

	public List<Car> findByModelName (String id);
}
