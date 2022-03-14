package week3.day2;


import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList <String>();

		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
	
		for (int i =0; i<list.size();i++)
		{
			for (int j=i+1; j<list.size();j++)
					{
				if (list.get(i).contains(list.get(j)) )
				{
					System.out.println(list.get(j));
				}
					}
		}
		

	}

}
