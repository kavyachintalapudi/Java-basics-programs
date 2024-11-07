package Javabasics;

import java.util.Scanner;

public class Pattern_Slash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n = obj.nextInt();
		for(int i=n;i>=1;i--)
	     {
	    	 for(int j=1;j<=i;j++)
	    	 {
	    		 System.out.print("#" +" ");
	    	 }
	    	 System.out.println();
	     }
		
		
		obj.close();
	}

}
