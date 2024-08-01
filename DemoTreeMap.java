//Demonstration of TreeMap
package com.learn;
import java.util.TreeMap;
class Student {
    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return id + " " + name + " " + address;
    }
}

public class DemoTreeMap {
    public static void main(String[] args) {
    	//TreeMap object
        TreeMap<Integer, Student> treeMap = new TreeMap<>();
         //values initialization using object
        treeMap.put(111, new Student(111, "bbbb", "Hyderabad"));
        treeMap.put(131, new Student(131, "aaaa", "Banglore"));
        treeMap.put(121, new Student(121, "cccc", "Mumbai"));
  
        System.out.println("TreeMap: " + treeMap);
    }
}