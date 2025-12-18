package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO
		int[] arr={3, 2, 11, 4, 6, 7};
		
		List<Integer> arr1 = new ArrayList<Integer>();
		
		for (Integer temp : arr) {
			arr1.add(temp);	
		Collections.sort(arr1);
		}
		System.out.println("The ordered List :" +arr1 );
		System.out.println("The second Largest value in the List : "+arr1.get(4));	
		
	}

}
