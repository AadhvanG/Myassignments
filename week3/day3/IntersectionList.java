package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		int a[]={3, 2, 11, 4, 6, 7};
		int b[]={1, 2, 8, 4, 9, 7};
		
	List<Integer> a1= new ArrayList<Integer>();
	List<Integer> b1= new ArrayList<Integer>();
	for (Integer ad1 : a) {
		a1.add(ad1);
	}
	
	for (Integer bd2 : b) {
		b1.add(bd2);
	}
	
	System.out.println(a1 +" AND "+b1);
		
	for (int i = 1; i <= 5; i++) {
		
		for (int j = 1; j <= 5; j++) {
			if (a1.get(j)== (b1.get(i))) {
				
			System.out.println("The Intersection value in List :" + (a1.get(j)));	
			}
		}
		
	}
	
	}
	
}
