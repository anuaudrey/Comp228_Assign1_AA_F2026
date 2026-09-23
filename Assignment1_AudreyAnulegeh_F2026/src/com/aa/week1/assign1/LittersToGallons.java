package com.aa.week1.assign1;

import java.util.Scanner;

/*
 * Author: Audrey Anulegeh
 * ID: 301408214
 * Course: COMP 228 
 * SEC: 004
 * Description: This is the LittersToGallons class that is used to convert liters to gallons using a constant conversion variable
 */
public class LittersToGallons {
	public void convertLitters() {
		Scanner input = new Scanner(System.in);
		final double conversionVariable=0.264172;
		
		System.out.println("Please enter Liters:");
		double liters=input.nextDouble();
		double gallons = liters * conversionVariable;
		
		System.out.println(liters + "liters = " + gallons + "gallons");
		
		
	}
}
