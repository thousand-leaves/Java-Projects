package com.qa.day2.roastdinner;

public class RoastDinnerRunner {

	public static void main(String[] args) {
		RoastDinner roast = new RoastDinner("Lamb", true, 6, 2, true);
		
		roast.cook();
		
		System.out.println(roast.toString());
	}

}
