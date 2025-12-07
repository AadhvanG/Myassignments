package week1.day2;

public class Fibonacciseries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int range = 8;
	        int a=0,b=1,c;

	        System.out.println("Fibonacci Series for range 8: ");
	        for (int i = 0; i < range; i++) {
	           
	            System.out.println(a);

	            c =a+b;
	            a = b;
	            b=c;
	        }	}


	
}
