package com.ananda.AnandaJava.CustomUtils;

public class UniversalFunction {
	
	public String randomIntString(int n) {
		
		String AlphaNumericString = "0123456789"; 
		
		 // create StringBuffer size of AlphaNumericString 
		  StringBuilder sb = new StringBuilder(n); 
		 
		  for (int i = 0; i < n; i++) { 
		 
		   // generate a random number between 
		   // 0 to AlphaNumericString variable length 
		   int index 
		    = (int)(AlphaNumericString.length() 
		      * Math.random()); 
		 
		   sb.append(AlphaNumericString 
		      .charAt(index)); 
		  }
		  
		return sb.toString();
	}

}
