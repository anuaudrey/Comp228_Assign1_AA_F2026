package com.aa.week1.assign1;
import java.util.Scanner;

/*
 * Author: Audrey Anulegeh
 * ID: 301408214
 * Course: COMP 228 
 * SEC: 004
 * Description: This is the Grades class used to calculate the average final grade of a student based on the grades entered for their 4 courses and translate it to the standard letter grading system
 */
public class Grades {
	public void GradeCalc() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your grades for course 1 (0-100): ");
		int course1=input.nextInt();
		
		System.out.println("Enter your grades for course 2 (0-100): ");
		int course2=input.nextInt();
		
		System.out.println("Enter your grades for course 3 (0-100): ");
		int course3=input.nextInt();
		
		System.out.println("Enter your grades for course 4 (0-100): ");
		int course4=input.nextInt();
		
		int average= (course1+course2+course3+course4)/4;
		
		String grade;
		 if (average>=80) {
			 grade="A";
		 } else if (average>=70) {
			 grade="B";
		 } else if (average>=60) {
			 grade = "C";
		 } else if (average>=50) {
			 grade = "D";
		 } else {
			 grade = "F";
		 }
		 
		 System.out.println("Final Grade: " + grade);
		
		
	}
}
