package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {
	public static void main(String[] args) {						
		int[] data = {3,2,11,4,6,7};
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);
		}
		//Arrange the array in ascending order
		Collections.sort(list);
		System.out.println("Sorted List is :"+list);
		//Pick the 2nd element from the last and print it
		System.out.println("Second largest number is :"+list.get(list.size()-2));
	}		


}
