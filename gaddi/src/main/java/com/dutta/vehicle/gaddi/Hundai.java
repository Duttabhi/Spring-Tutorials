package com.dutta.vehicle.gaddi;

import org.springframework.beans.factory.annotation.Autowired;

public class Hundai {

	@Autowired
	public Wheel wheel;
	
	public void feature() {
		System.out.println("The best selling car!");
	}
}
