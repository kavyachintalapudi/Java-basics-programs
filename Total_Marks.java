package Javabasics;
import java.util.Scanner;
public class Total_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the marks:");
       int totalmarks =sc.nextInt();
       if(totalmarks >=700)
       {
    	   System.out.println(totalmarks+" oustanding grade A");
       }
       else if(totalmarks<=700 && totalmarks>=600)
       {
    	   System.out.println(totalmarks+"very good grade B");
       }
       else if(totalmarks<=600 && totalmarks>=500)
       {
    	   System.out.println(totalmarks+"good grade C");
       }
       else
       {
    	   System.out.println(totalmarks+"fail D");
       }
       sc.close();
	}

}
