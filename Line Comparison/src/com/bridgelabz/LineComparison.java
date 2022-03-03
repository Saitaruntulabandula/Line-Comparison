package com.bridgelabz;
import java.util.Scanner;
public class LineComparison {

	public static void main(String[] args) {
System.out.println("Welcome to Line Comparison Computation Program");
		
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter coordinates of line Line1");
        
        System.out.println("Enter the value of x1 : ");
        int x1 = obj.nextInt();
        System.out.println("Enter the value of y1 : ");
        int y1 = obj.nextInt();
        System.out.println("Enter the value of x2 : ");
        int x2 = obj.nextInt();
        System.out.println("Enter the value of y2 : ");
        int y2 = obj.nextInt();

        System.out.println("Enter coordinates of line Line2");
        
        System.out.println("Enter the value of x3 : ");
        int x3 = obj.nextInt();
        System.out.println("Enter the value of y3 : ");
        int y3 = obj.nextInt();
        System.out.println("Enter the value of x4 : ");
        int x4 = obj.nextInt();
        System.out.println("Enter the value of y4 : ");
        int y4 = obj.nextInt();

        obj.close();
        
        Double length1 = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));
        
        Double length2 = Math.sqrt( ( x4 - x3 ) * ( x4 - x3 ) + ( y4 - y3 ) * ( y4 - y3 ));
        
        System.out.println("Length of the line L1 is : "+length1);
        
        System.out.println("Length of the line L2 is : "+length2);
        
        if(length1.equals(length2))
            System.out.println("Both lines L1 and L2 are equal.");
        else
            System.out.println("Lines L1 and L2 are not equal.");
	}

}
