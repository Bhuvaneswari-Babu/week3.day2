package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {	
	//Use the declared String text as input
	String text = "We learn java basics as part of java sessions in java week1";
	//Split the String into array and iterate over it 
	String[] str1=text.split(" ");
	//new set
	Set<String> set1=new LinkedHashSet<String>();
	//Initialize  loop to check whether the word is there 
	for (int i = 0; i < str1.length; i++) {
		set1.add(str1[i]);
	}
		System.out.println(set1);	
}
}
