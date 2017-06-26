package com.katmane.service;

public class TaxServiceImpl implements TaxService {

	
	public void calculateTaxForYear(String taxYear, String age, String totalTaxableEarnings, String typeOfEarnings,
			String medicalAidMembers) {
		
		Integer taxableEarnings;
		
		if(taxYear.equalsIgnoreCase("2017")){
			
			if(typeOfEarnings.equalsIgnoreCase("monthly")){
				
				taxableEarnings  = Integer.parseInt(totalTaxableEarnings) * 12;
				
				calculateTaxableBracket(taxableEarnings);
				
			}else{
				
				taxableEarnings = Integer.parseInt(totalTaxableEarnings);
				calculateTaxableBracket(taxableEarnings);
				
			}
			
		}else{
			
			
			
		}
		
	}
	
	private int calculateTaxableBracket(Integer taxableEarnings){
	
		Integer toTax;
		Integer calc;
		Integer calc1;
		Integer calc2;
	if(taxableEarnings > 0 && taxableEarnings <= 188000){
		
	}	
	else if(taxableEarnings > 188000 && taxableEarnings < 293600){
		//taxable income - 188000
		toTax = taxableEarnings - 188000;
		calc = (int)(toTax * 0.31);
	    calc1 = calc + 61296;
		//Not sure where the 20907 comes from...
		calc2 = calc1 - 20907;
		Integer monthlyTax = calc2/12;
		
	}else if(taxableEarnings > 293600 && taxableEarnings <=406400){
		//taxable income - 293600
		toTax = taxableEarnings - 293600;
	}else if(taxableEarnings > 406400 && taxableEarnings <=550100){
		//taxable income - 406400
		toTax = taxableEarnings - 406400;
	}else if(taxableEarnings > 550100 && taxableEarnings <=701300){
		//taxable income - 550100
		toTax = taxableEarnings - 550100;
	}else{
		//taxable income - 701300
		toTax = taxableEarnings - 701300;
	}
		return 0;
	}

}
