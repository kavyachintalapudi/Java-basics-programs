package Javabasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int number = sc.nextInt();
		 int fact=1;
		 for(int i=1;i<=number;i++)
		 {
			 fact*=i;
		 }
		System.out.print("Factorial Number: "+fact);

		sc.close();
	}

}
