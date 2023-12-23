package JavaCollections.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class isEmpty {

	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(1,2,1,3,3,4,5,5,6);
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0;i<lst.size();i++)
		{
			int x = lst.get(i);
			if(map.containsKey(x))
			{
				int count = map.get(x);
				map.put(x, count +1);
			}
			else {
				map.put(x, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			
			int phantu = entry.getKey();
			int dem = entry.getValue();
			
			System.out.println(phantu + " xuat hien " + dem +" lan ");
			
		}
	
	}

}
