package initial;
//util package
import java.util.Scanner;
public class LargestDemo{
public static void main(String[] args) {
	//variable declaration
int num1,num2,num3;
//scanner object
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
//reading numbers
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
//if condition
if(num1>num2&num1>num3)
	System.out.println("Largest number="+num1);
//else if condition
else if(num2>num3&num2>num1)
	System.out.println("Largest number="+num2);
//else condition
else
	System.out.println("Largest number="+num3);
	
}

}