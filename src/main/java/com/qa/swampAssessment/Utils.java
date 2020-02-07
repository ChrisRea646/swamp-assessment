package com.qa.swampAssessment;

import java.util.Scanner;

public class Utils {
	
	public static String direction() {	
	// TODO Auto-generated method stub
	// generate the method for working out how far away the player is from the
	// treasure
	// x^2 + y^2 = z^2 so square root of x^2 + y^2 = z
	// z = distance away from the treasure
	// y = west to east distance away from the treasure
	// x = north to south distance away from the treasure
	
		@SuppressWarnings("resource")
		Scanner direction = new Scanner(System.in);
		return direction.nextLine();		
	}
	



}
