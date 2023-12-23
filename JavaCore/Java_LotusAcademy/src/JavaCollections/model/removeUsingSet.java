package JavaCollections.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Set<String> listSet = new HashSet<>(Arrays.asList("Cam","Quyt","Mit","Dua","Le","Tao","Oi"));
		String s = "Hvit";
		
		if(listSet.contains(s)) {
			System.out.println("chuoi " + s +" trong set");
		}
		else {
			System.out.println("chuoi " +s +" khong chua trong set" );
		}*/
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.addAll(Arrays.asList(new Integer[] {1, 2, 5, 0, 6, 7}));
		HashSet< Integer> set2 = new HashSet<>();
		set2.addAll(Arrays.asList(new Integer[] { 0, 9, 7, 5, 3, 8}));
		
		set1.retainAll(set2);
		System.out.println("Cac phan tu chung nhau cua 2 mang la:" + set1);
		
		
	}

}
