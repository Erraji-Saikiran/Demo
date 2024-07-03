package initial;

import java.util.Scanner;

public class DemoFactorial {

	public static void main(String[] args) {
		int num;
		int i;
		int factorial=1;
		System.out.println("Enter a Factorial number:");
		Scanner tg=new Scanner(System.in);
				num=tg.nextInt();
				//4!=4*3*2*1
				for(i=1;i<=num;i++)
				{
			factorial=factorial*i;
			}
		System.out.println(factorial);
	}

}
