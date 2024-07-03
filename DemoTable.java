package initial;

import java.util.Scanner;

public class DemoTable {
	public static void main(String[] args) {
	int num;
		System.out.println("Enter a Table number");
	Scanner tab=new Scanner(System.in);
	num=tab.nextInt();
		for(int i=0;i<10;i++)
			System.out.println(num+"x"+(i+1)+"="+(num*(i+1)));
	

	}

}
