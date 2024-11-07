package Javabasics;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=obj.nextInt();
		int r,sum=0,temp;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome number");
		}
       obj.close();
	}

}
