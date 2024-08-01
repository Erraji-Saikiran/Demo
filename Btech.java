package com.learn;
//child class
public class Btech extends Graduation {
	//variable declaration
  String streams;
  String subjects;
  int attendence;
  
  void BtechDetails() {
	  System.out.println("Details are:"+"Stream="+streams+","+"Subject Name="+subjects+","+"Attendence="+attendence);
  }
  
   public static void main(String[] args) {
	   //Btech object
     Btech tech=new Btech();
     //initializing the values
     tech.university="JNTUH";
     tech.college="AVIH";
     tech.fee=50000;
     tech.streams="CSE";
     tech.subjects="Java";
     tech.attendence=80;
     //calling the methods
     tech.GraduationDetails();
     tech.BtechDetails();
     
	   
	   
	}

}
