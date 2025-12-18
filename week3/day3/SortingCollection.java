package week3.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingCollection {

	
	public static void main(String[] args) {
	 String[] array1= {"HCL", "Wipro", "Aspire Systems", "CTS"};
	 Arrays.sort(array1);
	 
	 List<String> arrList= new ArrayList<String>();
	 for (String arr2 : array1) {
		arrList.add(arr2);
	}	 
	 

	 
	 for (int i = 3; i >= 0; i--) {
			System.out.println(arrList.get(i));
		}
		
	 
	
	}
}
