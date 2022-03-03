package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {

	public static void main(String[] args) {
		System.out.println("Line Comparison Program");	
		
		Scanner obj = new Scanner(System.in);
		
	  System.out.println("Enter the value of x1:");
		int x1 = obj.nextInt();
		
		System.out.println("Enter the value of y1:");
		int y1 = obj.nextInt();
		
		System.out.println("Enter the value of x2:");
		int x2 = obj.nextInt();
		
		System.out.println("Enter the value of y2:");
		int y2 = obj.nextInt();
		
		obj.close();
		
		double length= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println("Distance Between two points is: " +length);
	}

}
