package Javabasics;

import java.util.Scanner;

public class Sum_Program {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int x=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		x= b+c;
		System.out.println(x);
		sc.close();
	}
}
