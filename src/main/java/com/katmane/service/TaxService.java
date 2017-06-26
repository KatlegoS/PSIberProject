package com.katmane.service;

public interface TaxService {

	void calculateTaxForYear(String taxYear, String age, String totalTaxableEarnings, String typeOfEarnings,
			String medicalAidMembers);
	

}
