//Demonstration of ArrayDeque
package com.learn;
import java.util.ArrayDeque;
public class DemoArrayDeque {
	public static void main(String[] args) {
		//ArrayDeque object
	ArrayDeque<String>arrdeq=new ArrayDeque<String>();
	//inserting values
	arrdeq.add("Monday");
	arrdeq.add("Tuesday");
	arrdeq.add("Wednesday");
	arrdeq.add("Thursday");
	//printing the arrdeq using various methods
	   System.out.println(arrdeq);
       arrdeq.addFirst("Sunday"); 
	   arrdeq.addLast("Friday");
	    System.out.println(arrdeq);
	    System.out.println(arrdeq.size());
	    System.out.println(arrdeq.pop());
	    System.out.println(arrdeq);
	    System.out.println(arrdeq.peekLast());
	    
	
	
	}
}
