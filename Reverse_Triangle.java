package Javabasics;

public class Reverse_Triangle {
	public static void main(String args[]) {
	int rows=5;
	for (int i = 0; i < rows; i++) {
        for (int j = 0; j < rows - i; j++) {
            System.out.print((rows - j) + " ");
        }
        System.out.println();
    }

}
}
