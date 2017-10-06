package com.example.demo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class HealthInsuranceSurveyor implements InsuranceSurveyor {

	private Claim claim;
	private static Logger logger =  LogManager.getLogger("HealthInsuranceSurveyor.class");
	public HealthInsuranceSurveyor(Claim claim) {
		this.claim = claim;
	}

	public boolean validator() {
		logger.info("Validating health insurance claim ...");
		return true;
	}

}
