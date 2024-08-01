//Demonstration of ArrayList employee
package com.learn;
import java.util.ArrayList;
class Employee{
	 String name;
	Integer id;
	Integer salary;
 public Employee (String name,Integer id,Integer salary) {
	 super();
	 this.name=name;
	 this.id=id;
	 this.salary=salary;
 }
 public Employee() {
	 super();
 }
 public String getName() {
	 return name;
 }
 public Integer getId() {
	 return id;
 }
public Integer getsalary() {
	return salary;
}
}
public class DemoEmployee {
	public static void main(String []args) {
		ArrayList<Employee>employeeList=new ArrayList<Employee>();
		//inserting employee objects to list
		employeeList.add(new Employee("sai",1,25000));
		employeeList.add(new Employee("kiran",2,27000));
		employeeList.add(new Employee("ram",5,29000));
		 //retrieving employee objects from list 
		  for(Employee emp:employeeList) {
			  System.out.println(emp.getName());	
				System.out.println(emp.getId());
				System.out.println(emp.getsalary());
	}
	}
	
	}


