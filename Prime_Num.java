package Javabasics;

import java.util.Scanner;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value:");
		int num =sc.nextInt();
	    boolean obj = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      if (num % i == 0) {
	        obj = true;
	        break;
	      }
	    }

	    if (!obj) 
	    {
	      System.out.println(num + " is a prime number.");
	    }
	    else
	    {
	      System.out.println(num + " is not a prime number.");
	    }
	    sc.close();
	  }

	}


