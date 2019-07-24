package com.dutta.vehicle.gaddi;

import org.springframework.stereotype.Component;

@Component
public class Maruti implements FourWheeler{
	public Maruti() {
		System.out.println("starting Maruti");
	}
	
	public void drive() {
		System.out.println("inside maruti");
	}
}
