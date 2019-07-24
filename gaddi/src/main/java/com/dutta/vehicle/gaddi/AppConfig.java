package com.dutta.vehicle.gaddi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	/*it will match the return type that is Hundai. getHundai() name is of no use*/
	@Bean
	public Hundai getHundai() {
		return new Hundai();
	}
	@Bean
	public Wheel getWheel() {
		return new Wheel();
	}
}
