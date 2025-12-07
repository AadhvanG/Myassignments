package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
        int n=97;
        int count=0;
        
        for (int i = 2; i < n; i++) {
        	if(n%i==0)
        	{
        		count++;
        	}
        	
        }
        if (count==0) {
			System.out.println("Yes,It is prime number : "+n);
		} else {
            System.out.println("No,It is not a prime number: "+n);
		}
        		
        
			
		}
}