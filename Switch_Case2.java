package Javabasics;

import java.util.Scanner;

public class Switch_Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read =new Scanner(System.in);
		  System.out.println("Enter the days:");
			 String days=read.nextLine();

		  switch(days)
		  {
		  case "Monday":
			  System.out.println("1");
			  break;
		  case "Tuesday":
			  System.out.println("2");
			  break;
		  case "Wednesday":
			  System.out.println("3");
			  break;
		  case "Thursday":
			  System.out.println("4");
			  break;
		  case "Friday":
			  System.out.println("5");
			  break;
		  case "Saturday":
			  System.out.println("6");
			  break;
		  case "Sunday":
		  		System.out.println("7");
		  		default:
		  			System.out.println("Invalid days");
		  		
	}
		  read.close();
		  }

}
