package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] y= {1,2,3,4,10,6,8}; 
		
		List<Integer> yy = new ArrayList<Integer>();
		
		for (Integer temp : y) {
			yy.add(temp);
			
		}
		Collections.sort(yy);
		System.out.println("List :" + yy);
		
		for (int i = 0; i < y.length-1; i++) {
			if (yy.get(i)+1!=yy.get(i+1)) {
				System.out.println(yy.get(i)+1);
			}
			
		}
	}

}
