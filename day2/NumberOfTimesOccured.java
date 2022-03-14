package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class NumberOfTimesOccured {

	public static void main(String[] args) {
		List<String> list = new ArrayList <String>();
		
		int count = 0;
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
		list.add("Adam");
		list.add("George");
		list.add("Adam");
		
	
			for (int i=0; i<list.size();i++)
			{
				if (list.get(i) .contains("Adam") )
				{
					count++;
					
				}
			}
		
			System.out.println(count);


	}

}
