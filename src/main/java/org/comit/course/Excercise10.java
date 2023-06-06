package org.comit.course;

public class Excercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a Java program that, given the following variable, prints out the sum of its digits.
          int a = 25;
         Print out: 7

		 */
		int a =25;

		
		int sum = a % 10; // gets and adds 5 to sum;
		
		a/=10;// removes 5 from a;
		
		sum+=a; //adds 2 to sum
		
		System.out.println("The sum of the digits is: " + sum);
		
		 

	}

}
