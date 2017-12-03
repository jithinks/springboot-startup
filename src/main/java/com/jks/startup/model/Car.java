package com.jks.startup.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	private String id;
	private String modelName;
	private String manufactureName;
	
	public Car(){}
	public Car(String id, String modelName, String manufatureName){
		this.id = id;
		this.modelName = modelName;
		this.manufactureName = manufatureName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufactureName() {
		return manufactureName;
	}
	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	} 
	
	@Override
	public String toString() {
		return "{"
				+ "id = "+this.id
				+ "modelName = "+this.modelName
				+ "manufactureName = "+this.manufactureName
				+"}";
	}
}
