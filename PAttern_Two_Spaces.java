package Javabasics;

public class PAttern_Two_Spaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >= 1; i++) {
            for (int j = 1; j <= i; j--2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
	}
}
