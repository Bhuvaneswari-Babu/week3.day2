package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicates {
	public static void main(String[] args) {
		//input
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//new List
		List<Integer> list=new ArrayList<Integer>();
		//initializing count as 0
	int count=0;
	//looping
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length-1; j++) {
			if(arr[i]==arr[j]) {
				count++;
				if (count>0) {
					list.add(arr[i]);
				}
			}
		}
		
	}System.out.println("Duplicate numbers are:"+list);
	
	}

}
