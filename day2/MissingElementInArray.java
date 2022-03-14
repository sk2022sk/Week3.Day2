package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int arr1 : arr)
				{
					list.add(arr1);
					
				}

				// Sort the array	

				Collections.sort(list);
				int i = 1;
				
				// loop through the array (start i from arr[0] till the length of the array)

				for (int j =0; j<list.size(); j++)
				{
				
					// check if the iterator variable is not equal to the array values respectively
					if(i != list.get(j))
					{
						// print the number
						
						System.out.println(j+1);
						i = i+2;
					}
						
						// once printed break the iteration
					else
					{
						i++;
					}
					}
	}

}
