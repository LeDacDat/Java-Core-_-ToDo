package JavaCollections.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class secondProgram {

	public static void main(String[] args) {
		
		List<Integer> lst1 = new ArrayList<>();
		lst1.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		List<Integer> lst2 =new ArrayList<>();
		lst2.addAll(Arrays.asList(new Integer[] {12,122,3,4}));
		
		lst1.retainAll(lst2);
		System.out.println("cac phan tu trung nhau :" + lst1);
	}

}
