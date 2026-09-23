package com.aa.week1.assign1;
import java.util.Scanner;

/*
 * Author: Audrey Anulegeh
 * ID: 301408214
 * Course: COMP 228 
 * SEC: 004
 * Description: This is the LittersToGallons class that is used to convert CAD to USD using a specific exchange rate
 */
public class CADToUSD {
	public void convertCurrency() {
        Scanner input = new Scanner(System.in);

        final double EXCHANGE_RATE = 0.7095;

        System.out.print("Enter amount in CAD: ");
        double cad = input.nextDouble();

        double usd = cad * EXCHANGE_RATE;

        System.out.printf("%.2f CAD = %.2f USD%n", cad, usd);

        input.close();	
	}

}
