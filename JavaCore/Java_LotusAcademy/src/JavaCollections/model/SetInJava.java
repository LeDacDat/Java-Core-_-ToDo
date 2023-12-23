package JavaCollections.model;

import java.util.HashSet;
import java.util.Set;

public class SetInJava {

	public static void main(String[] args) {
		Set<Integer> listSet = new HashSet<>();
		listSet.add(2);
		listSet.add(3);
		listSet.add(4);
		listSet.add(5);
		listSet.add(6);
		listSet.add(7);
		System.out.println("kich co cua set la:" +listSet.size());
		System.out.println("list set vua tao:" + listSet);

	}

}
