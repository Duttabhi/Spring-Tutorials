package com.dutta.vehicle.gaddi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolvoAsComponent implements FourWheeler{
	
	@Autowired
	Maruti maruti;
	
	public void drive() {
		System.out.println("inside Volvo " + maruti);
	}
}
