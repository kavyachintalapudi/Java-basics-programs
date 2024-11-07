package Javabasics;
import java.util.Scanner;
public class Square_Cube_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     System.out.println("Enter the number:");
     Scanner sc=new Scanner(System.in);
     int x=sc.nextInt();
     
	   int square=x*x;
	   int cube=x*x*x;
	   System.out.println("square:"+ square);
	   System.out.println("cube:"+ cube);
     sc.close();
       
	}
	

}
