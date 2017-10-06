package com.example.demo;


import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
		Claim claim = new Claim();
		HealthInsuranceSurveyor objHealthInsurance = new HealthInsuranceSurveyor(claim);
		VehicleInsuranceSurveyor objVehicleInsurance = new VehicleInsuranceSurveyor(claim);

		Manager manager = new Manager(objHealthInsurance);
		manager.status();

		manager = new Manager(objVehicleInsurance);
		manager.status();
		
	}
}
