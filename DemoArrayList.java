//Demonstration of ArrayList
package com.learn;
import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		//list object
		List list=new ArrayList();
		//list values initialization
		list.add(10);
		list.add(3.14);
		list.add('a');
		list.add("sai");
		list.add(null);
		  System.out.println(list);
		  System.out.println(list.size());
		System.out.println(list.set(1, 100));
      list.add(2,25);
      System.out.println(list);
      System.out.println(list.contains(10));
      
   

	}

}
