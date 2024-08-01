package com.learn;
import java.util.TreeSet;
public class DemoTreeSet {

	public static void main(String[] args) {
		//TreeSet object
		TreeSet<String> ts=new TreeSet<String>();
		//initializing values using ts object
        ts.add("Hyderabad");
        ts.add("Mumbai");
        ts.add("Bangalore");
        ts.add("chennai");
        ts.add("Hyderabad");
        ts.add("Pune");
        //ts.add(null);
        System.out.println("Name:"+ts);
          for(String cit:ts)
        	  System.out.println(cit);
          //printing using various methods
          System.out.println(ts.first());
          System.out.println(ts.last());
          System.out.println(ts.size());
          System.out.println("Is cities are empty:"+ts.isEmpty());
	   //tset object 
      TreeSet tset=new TreeSet();
      //initializing integer values
      tset.add(15);
      tset.add(20);
      tset.add(30);
      System.out.println(tset);
      System.out.println(tset.descendingSet());
      System.out.println(tset.first());
      System.out.println(tset.last());
      
	}

}

