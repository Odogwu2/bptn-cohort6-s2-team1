package com.bptn.course.understandingPrintStatements;

public class PrintStatements {

	public static void main(String[] args) {
		System.out.print("My name is Lani. "); // using the 'print' leaves the next output of the print statement on the same line. 
		System.out.print("I am quite wise for my age.\nI like shawarma.\n"); // having \n takes the words to the next line. 
		System.out.println ("I live in Downtown Toronto. \nAround Dundas Square."); // anything after println is printed on a new line. 
		
		String message = "Paul Scholes"; // declaring a String variable and assigning the value Paul Scholes to the variable name 'message'
		System.out.println (message); // calling the variable in the print statement. 
		
		int age = 42; 
		String food = "paella";
		
		// using the + operator to join variables and string literals 
		System.out.println ("His name is " + message + ", " + "He is "+ age+ " years old," + " and his favorite food is " + food + "."); 
		
		int x = 5; 
		int y = 2; 
		int total = x + y; 
		System.out.println (total);
		
		int a = 1; 
		int b = 3; 
		
		int result = a * b; 
		System.out.println("a * b: " + result); 
		
		
		int g = 15; 
		int h = 8; 
		boolean result1 = g > h; 
		// using boolean hear because it's a comparison operator 
		//using variable result1 because result is already a variable in line 27 & 28. 
		System.out.println(result1); 
		
		
		
		int d = 10; 
		int e = 8;
		int f = 12;

		//boolean result2 = (d > e) && (e > f); // "and" is false because (a > b) is true and (b > c) is false.
		//boolean result3 = (d > e) || (e > f); // "or" is true because (a > b) is true and (b > c) is false. Only one condition needs to be met in order for this condition to be declared true.
		boolean result4 = !(d > e); // "not" is false because (a > b) is true
		
		System.out.println(result4);
		
		int score = 0;
		System.out.println(score);
		
		score ++; // an alternative would be to declare score = score + 1; to get an increment. 
		System.out.println(score);
		
		
		int k = 4; 
		int p = k++; 
		System.out.printf( "k=%d, p=%d", k, p); // using the %d character 
		
		
		
		//Post-Increment
		//int a = 5; 
		//int b = a++; 

		// System.out.printf("a=%d, b=%d", a, b); // Prints out: a=6, b=5

		/* Pre-Increment 
		a = 5; 
		b = ++a; 

		System.out.printf("a=%d, b=%d", a, b); // Prints out: a=6, b=6
		*/

		/* Post-Decrement 
		int a = 5; 
		int b = a--; 

		System.out.printf("a=%d, b=%d", a, b); // Prints out: a=4, b=5
		*/
		

		/* Pre-Decrement 
		a = 5; 
		b = --a; 

		System.out.printf("a=%d, b=%d", a, b); // Prints out: a=4, b=4
		*/
		
	
		

		
		
		

	}

}
