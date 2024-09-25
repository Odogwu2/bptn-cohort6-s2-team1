package com.bptn.course._03_flow_control._01_conditional_statement;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		
		//Step 1: Create an object from Scanner class 
		Scanner scanner = new Scanner (System.in);
		
		//Step 2: Prompt the user to enter a number 
		System.out.println ("Enter the number: ");
		
		//Step 3: Read the input & store it inside a variable 
		int number = scanner.nextInt(); 
		
		//Step 4: Check if a number is positive or negative. Use conditionals 
		
		if (number > 0) {
			System.out.println ("The number is positive.");
		}
		else if (number < 0) {
			System.out.println ("The number is negative.");
		}
		else if (number == 0) {
			System.out.println ("The number is equal to zero.");
		}
		
		//Step 5: Close the scanner
		scanner.close();

	}

}
