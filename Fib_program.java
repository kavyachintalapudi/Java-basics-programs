package Javabasics;
import java.util.Scanner;
public class Fib_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int first =0,second=1;
		for(int i=1;i<=n;++i)
		{
			System.out.print(first+" ");
			int next=first+second;
			first=second;
			second=next;

		}
		
		sc.close();

	}

}
