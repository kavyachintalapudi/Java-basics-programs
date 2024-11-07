package Javabasics;

public class Prime_Numbers_10_To_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=10,last=20;
		for(int i=start;i<=last;i++) {
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}

	}

}
