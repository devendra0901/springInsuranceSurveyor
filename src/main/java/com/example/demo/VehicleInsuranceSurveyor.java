package com.example.demo;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class VehicleInsuranceSurveyor implements InsuranceSurveyor {

	private Claim claim;
	private static Logger logger =  LogManager.getLogger("VehicleInsuranceSurveyor.class");
	public VehicleInsuranceSurveyor(Claim claim) {
		this.claim = claim;
	}

	public boolean validator() {
		logger.info("Validating vehicle insurance claim ...");
		return true;
	}

}
