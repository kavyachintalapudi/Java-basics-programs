package Javabasics;
import java.util.Scanner;
public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int x = sc.nextInt();
        while(x<=10)
        {
        	System.out.println("Kavya");
        	x=x+1;
        	if(x==6)
        	{
        		System.out.println("Welcome");
        		continue;
        	}
        	System.out.println("Hai");
        }
        sc.close();
	}

}
