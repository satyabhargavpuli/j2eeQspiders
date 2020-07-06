package com.bigdecimal.com;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {
	
	BigDecimal principal;
    BigDecimal  intrest;
	public SimpleIntrestCalculator(String principal, String intrest) {
		this.principal = new  BigDecimal(principal);
		this.intrest = new  BigDecimal(intrest).divide(new BigDecimal(100));
	}
	public BigDecimal calculateTotalValue(int years) {
		
		//total = principal+principal*intrest*years
	   BigDecimal bigDecimal = 
       principal.add(principal.multiply(intrest).multiply(new BigDecimal(years)));
		return bigDecimal;
	}
    
}