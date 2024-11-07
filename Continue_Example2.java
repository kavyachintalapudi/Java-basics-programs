package Javabasics;

import java.util.Scanner;

public class Continue_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a value:");
       int x= sc.nextInt();
       for(int i=1;i<=10;i++)
       {
    	   System.out.println("Hai");
    	   while(x<=10)
    	   {
    		 System.out.println("Welcome");
    		 if(x>=5)
    		 {
    			 System.out.println("Kavya");
    			 continue;
    		 }
    		 System.out.println("Hello");
    		 x=x+1;
    	   }
    	   System.out.println("Bye....");
       }
       sc.close();
	}

}
