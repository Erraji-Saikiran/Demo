//Demonstration of Exception Handling
package com.learn;
public class DemoException {

	public static void main(String[] args) {
   try {
	   //declaring an array in try block
	   int [] arr= {10,20,30};
	   System.out.println(arr[5]); 
	   try {
		   //declaring variables in try block
	   int c=10/0;
	         System.out.println(c);
   
   }
	   //catching the exceptions raised by try block
	   catch(ArithmeticException e) {
	   System.out.println(e);}
   }catch(ArrayIndexOutOfBoundsException ae) {
	   System.out.println(ae);
   }
   catch(Exception e) {
	   System.out.println(e);
   }
   finally {
	   System.out.println("Finally Block");
   }
			
	}
}	
	