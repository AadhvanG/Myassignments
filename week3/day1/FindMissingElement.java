package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,3,2,8,6,7};
		//sorting array
		Arrays.sort(arr);
		//for loop to check the which value is missing
		for (int i = 0; i < arr.length; i++) {
			//if condition to check index value compared to i 
			if (arr[i]!=i+1) {
			
		//print if the i+1 value is equal to array value
			System.out.println(" missing : " + (i+1));
			break;
			}
					
		}
		
	}

}
