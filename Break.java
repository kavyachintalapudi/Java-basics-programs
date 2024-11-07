package Javabasics;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a value:");
          int x = sc.nextInt();
          for(int i=1;i<=20;i++)
          {
        	  System.out.println("Welcome");
        	  if(x>=10)
        	  {
        		  System.out.println("Hai");
        		  break;
        	  }
        	  System.out.println("Good bye....");
          }
          sc.close();
	}

}
