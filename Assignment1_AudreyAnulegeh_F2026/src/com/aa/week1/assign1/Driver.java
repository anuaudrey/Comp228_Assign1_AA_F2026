package com.aa.week1.assign1;
import java.util.Scanner;
import com.aa.week1.assign1.*;

/*
 * Author: Audrey Anulegeh
 * ID: 301408214
 * Course: COMP 228 
 * SEC: 004
 * Description: This is the Driver class that creates objects for all other classes and use them to call their methods
 */
public class Driver {

	public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        
		//Task A
        System.out.println("\nTask A");
		Grades gc = new Grades();
		gc.GradeCalc();
		
		//Task B
		System.out.println("\nTask B");
		MilesToKm converter = new MilesToKm();
		converter.MilesCoverter();
		
		//Task C
		System.out.println("\nTask C");
		LittersToGallons lg = new LittersToGallons();
		lg.convertLitters();
		
		//Task D
		System.out.println("\nTask D");
		CADToUSD currency = new CADToUSD();
		currency.convertCurrency();
		
		
	}

}
