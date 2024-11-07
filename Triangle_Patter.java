package Javabasics;

import java.util.Scanner;

public class Triangle_Patter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int rows=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
        	for(int j=rows-i;j>1;j--)
        	{
        		System.out.print(" ");
        	}
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print("*" +" ");
        	}
        	System.out.println();
        }
		sc.close();
	}
}
