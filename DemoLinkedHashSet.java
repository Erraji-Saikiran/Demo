//Demonstration of LinkedHashSet
package com.learn;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		//LinkedHashSet object
		LinkedHashSet<Integer> lhst=new LinkedHashSet<Integer>();
        //initializing string values 
		lhst.add(10);
         lhst.add(40);
         lhst.add(20);
         lhst.add(15);
         lhst.add(10);
         lhst.add(null);
         System.out.println("Integer Values are:"+lhst);
         System.out.println("Is empty values:"+lhst.isEmpty());
         //printing using for each loop
        for(Integer s:lhst)
        System.out.println(s);
         //Iterator object
         Iterator<Integer> itr=lhst.iterator();
         while(itr.hasNext());
         System.out.println(itr.next());
	    
	}    

}
