package com.qa.day2.roastdinner;

public class RoastDinner {
	String Meat;
	boolean hasSprouts;
	int numOfPotatoes;
	int numOfYorkshirePuddings;
	boolean hasGravy;
	
	// Default constructor
	public RoastDinner() {}

	// Method overloading
	// All args constructor
		public RoastDinner(String Meat, boolean hasSprouts, int numOfPotatoes, int numOfYorkshirePuddings, boolean hasGravy) {
			this.Meat = Meat;
			this.hasSprouts = hasSprouts;
			this.numOfPotatoes = numOfPotatoes;
			this.numOfYorkshirePuddings = numOfYorkshirePuddings;
			this.hasGravy = hasGravy;
		}
	
	public void cook() {
		System.out.println("I'm cooking");
	}
	
}
