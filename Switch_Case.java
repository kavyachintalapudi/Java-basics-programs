package Javabasics;
import java.util.Scanner;
public class Switch_Case {
  public static void main(String args[])
  {
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the daysNo:");
		 int daysNo = sc.nextInt();

	  switch(daysNo)
	  {
	  case 1:
		  System.out.println("Monday");
		  break;
	  case 2:
		  System.out.println("Tuesday");
		  break;
	  case 3:
		  System.out.println("Wednesday");
		  break;
	  case 4:
		  System.out.println("Thursday");
		  break;
	  case 5:
		  System.out.println("Friday");
		  break;
	  case 6:
		  System.out.println("Saturday");
		  break;
	  case 7:
	  		System.out.println("Sunday");
	  		default:
	  			System.out.println("Invalid daysNo");
	  		
	  }
	  sc.close();
	
}
}
