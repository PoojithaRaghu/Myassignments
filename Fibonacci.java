package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		
		 int terms = 10; 
	        int a = 0, b = 1;

	        System.out.print("Fibonacci Series: ");

	        for (int i = 1; i <= terms; i++) 
	        {
	            System.out.print(a + " ");
	            int next = a + b;
	            a = b; 
	            b = next; 
	        }
	    }
	}

