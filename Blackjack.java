// Given 2 integer values greater than 0, return whichever is closest to 21 
// without going over 21. 
// If they both go over 21 then return 0.
//	play (10, 21) -> 21
//	play (20, 18) -> 20
//	play (1, 22) -> 1
//	play (22, 23) -> 0

package com.qa.day2.blackjackExercise;

public class BlackjackExercise {
	
	public static void main(String[] args) {

// Variables
	int dealer;
	int player;
	
	dealer = 22;
	player = 23;
	
// Method
		
		if (dealer > 21 && player > 21) {
			System.out.println("0");
		} else if (dealer > 21) {
			System.out.println(player);
		} else if (player > 21) {
			System.out.println(dealer);
		} else
		System.out.println(Math.max(dealer, player));
	}
}	