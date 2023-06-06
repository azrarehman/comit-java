package org.comit.course;

public class Exercise08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* a) (101 + 0) / 3
			   b) 3.0e-6 * 10000000.1
               c) true && true
               d) false && true
               e) (false && false) || (true && true)
               f) (false || false) && (true && true)
            */
		  
			double a = (double)(101 + 0)/3;
			double b=3e-6*10000000.1;
			boolean c= true && true;
			boolean d= false && true;
			boolean e= (false && false) || (true && true);
			boolean f=(false || false) && (true && true);

			
			/*
			 *  We can use underscores to separate the digits of long number 
			 *  to improve readability. It doesn't affect the number.
			 */
		
		   			
			System.out.println("The value of a is: " + a);
			System.out.println("The value of b is: " + b);
			System.out.println("The value of c is: " + c);
			System.out.println("The value of d is: " + d);
			System.out.println("The value of e is: " + e);
			System.out.println("The value of f is: " + f);
	}

}
