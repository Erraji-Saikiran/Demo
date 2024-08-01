//Addition of two Square matrices
package com.learn;
public class AdditionMatrix {
	public static void main(String[] args) {
		//Declaring Arrays
		int a[][]= {{1,2,3},{2,3,4},{3,4,5}};
		int b[][]= {{4,3,2},{3,2,1},{4,3,2}};
		int c[][]=new int[3][3];
		int i,j;
		//calculating sum
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
			c[i][j]=a[i][j]+b[i][j];
		}
		//printing sum
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
		
	}

}
