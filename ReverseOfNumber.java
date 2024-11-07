package Javabasics;
import java.util.Scanner;
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ReverseOfNumberValue();  
	}
	public static void ReverseOfNumberValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse of number is:"+rev);
		sc.close();
	}

}
