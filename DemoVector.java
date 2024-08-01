package com.learn;

import java.util.List;
import java.util.Vector;

public class DemoVector {

public static void main(String[]args) {	
	List<String> list =new Vector<String>();
	list.add("Apple");
	list.add("orange");
	list.add(1,"mango");
	  List<String>list1=new Vector<String>();
	  list1.addAll(list);
	  list1.add("banana");
	  
	  System.out.println(list.containsAll(list1));
	  list1.remove(3);
	  System.out.println(list.equals(list1));
	  list.add("Apple");
	  System.out.println(list.lastIndexOf("Apple"));
	    List<String> slist=list.subList(0,3);
	    
	  
}
}