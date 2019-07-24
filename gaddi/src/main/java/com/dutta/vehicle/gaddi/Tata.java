package com.dutta.vehicle.gaddi;

public class Tata implements FourWheeler{
	public String model;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void drive() {
		System.out.println("inside Tata " + model);
	}
}

