//Demonstration of LinkedHashMap
package com.learn;
import java.util.LinkedHashMap;
import java.util.Map;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		//object
	LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
	lhm.put(1,"sai");
	lhm.put(2,"kiran");
	lhm.put(null, null);
	System.out.println(lhm);
	//retrieve key value pairs
	for(Map.Entry m:lhm.entrySet()) 
		System.out.println(m.getKey()+" "+m.getValue());
	}	
}
