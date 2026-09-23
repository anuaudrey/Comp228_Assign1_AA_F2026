package com.aa.week1.assign1;
import java.util.Scanner;

/*
 * Author: Audrey Anulegeh
 * ID: 301408214
 * Course: COMP 228 
 * SEC: 004
 * Description: This is the MilesToKm class that is used to convert miles to kilometers using a constant conversion variable
 */
public class MilesToKm {
	public void MilesCoverter() {
		Scanner input = new Scanner(System.in);
		final double conversionVariable=1.609;
		
		System.out.println("Please enter miles:");
		double miles=input.nextDouble();
		double kilometers = miles * conversionVariable;
		
		System.out.println(miles + "miles = " + kilometers + "Kilometers");
		
		

	}
}
