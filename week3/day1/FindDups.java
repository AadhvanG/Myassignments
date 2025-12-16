package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class FindDups {

	public static void main(String[] args) {

		int num[]={2, 5, 7, 7, 5, 9, 2, 3};

		Arrays.sort(num);
		
		for (int i=1; i<num.length; i++) {
			if (num[i]==num[i-1] ) { 
				System.out.println("Duplicate value is "+ num[i]);
				
			}
			
		}
		
	}
	
	

}
