package Javabasics;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i+" "); 
            }
        }
	}
	 public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
