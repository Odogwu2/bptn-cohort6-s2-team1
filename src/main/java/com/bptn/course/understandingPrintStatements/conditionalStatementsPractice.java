package com.bptn.course.understandingPrintStatements;

public class conditionalStatementsPractice {

	public static void main(String[] args) {
		
		int testScore = 60; 
		char grade = 0; 
		
		if (testScore >= 70) {
			grade = 'A'; 
		}
			else if (testScore >=61) {
				grade = 'B';
			}
			else if (testScore <=60) {
				grade = 'C';
			}
			
		System.out.println ("Your grade is: " + grade + "."); 
		}
		
}
		//int grade = 80; 
		//if (grade < 80) {
			//System.out.println ("You need to do better"); 
		//}else {
			//System.out.println ("You are on track to success");
		//}
