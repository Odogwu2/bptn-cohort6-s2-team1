package com.bptn.course._03_flow_control._03_for_loop;

public class FibonacciSeries {

	public static void main(String[] args) {
		// needs 0 and 1 to start the sequence 
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89....
		
		//predefined numbers to begin the fibonacci sequence. 
		
		int num1 = 0; 
		int num2 = 1;
		int num3; 
		
		System.out.println (num1); 
		System.out.println (num2); 
		
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2; //0+1 = 1
			
			num1 = num2; 
			num2 = num3; 
			
			System.out.println(num3); 
			
		}
		
		
	}

}


//i = 0 (1st iteration) 
//num1 = 0 num2 = 1
//num3 = 1

//num1= num2; 1
//num2 = num3; 1

//i = 1 (2nd iteration) 
//num3 = num1+num2; // i+1 = 2

//num1 = num2; //1
//num2 = num3; //2 


//i = 2 (3rd iteration) 
//num3 = num1+num2; //1+2 = 3

//num1 = num2 //2
//num2 = num3 //3

