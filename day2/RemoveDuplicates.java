package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static <string> void main(String[] args) {
	
		
		// Use the declared String text as input
		
	String text = "We learn java basics as part of java sessions in java week1";
	
 			
	// Split the String into array and iterate over it 
	
	String[] array = text.split(" ");
	Set<String> set = new LinkedHashSet<String>();
	List<String> list = new ArrayList<String>(set);
		
	
	// Initialize another loop to check whether the word is there in the array
		
	for (String EachList:array)
	{
	
	list.add(EachList);
	set.addAll(list);
	}
	// if it is available then increase and count by 1.
		
	list.clear();
	list.addAll(set);
	
    // if the count > 1 then replace the word as "" 
	for (int i =0 ; i<list.size(); i++)	
	{
    // Displaying the String without duplicate words
	System.out.println(list.get(i) +" ");	
	
	}
	
	}

}
