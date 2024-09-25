package com.bptn.course._03_flow_control._03_for_loop;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Enter your number to calculate the factorial: ");
		int number = scanner.nextInt(); 
		
		int ft = 1; 
		
		for (int i = 1; i<=number; i++) {
			ft = ft * i; 
		}
		
		System.out.println("The factorial of your input " + "(" + number + ")" + " is: " + ft );
		scanner.close();
		
		

	}

}
