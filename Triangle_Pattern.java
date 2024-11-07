package Javabasics;

public class Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
        for(int i=1;i<n;i++)
        {
        	for(int j=i;j< 2*(n-1);j++)
        	{
        		System.out.print("*"+" ");
        	}
        	System.out.println();
        }
	}

}
