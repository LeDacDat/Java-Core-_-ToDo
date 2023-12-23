package JavaCollections.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class timMin_Max {
	
	static Integer timMin(List<Integer> lst)
	{
		if(lst == null || lst.size() == 0)
			return Integer.MAX_VALUE;
		Collections.sort(lst);
		return lst.get(0);
	}
	
	static Integer timMax(List<Integer> lst)
	{
		if(lst == null || lst.size() == 0)
			return Integer.MIN_VALUE;
		Collections.sort(lst);
		return lst.get(lst.size()-1);
	}

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);		
		lst.add(6);
		lst.add(7);

		System.out.println("Max = " + timMax(lst));
		System.out.println("Min = " + timMin(lst));
		

	}

}
