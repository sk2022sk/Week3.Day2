package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		int [] array1 = {3,2,11,4,6,7};
		int [] array2 = {1,2,8,4,9,7};
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i : array1) 
		{
			list1.add(i);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int j : array2) 
		{
			list2.add(j);	
		}
		
		for (int int1 : list1) 
		{
			for(int int2:list2) 
			{
				if(int1==int2) 
				{
					list.add(int1);
				}	
			}			
		}
		
		System.out.println(list);

	}

}
