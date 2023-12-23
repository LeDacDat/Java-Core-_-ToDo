package JavaCollections.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class replaceString {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		list.add("Toan");
		list.add("Ly");
		list.add("Hoa");
		list.add("Van");
		list.add("Anh");
		list.add("Dia");
		
		System.out.println(list);
		
		String[] str = list.toArray( new String[0]);
		
		for(int i = 0;i<str.length;i++)
		{
			String s = str[i];
			System.out.print( s + " , ");
		}
		
	}

}
