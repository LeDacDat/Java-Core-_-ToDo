package JavaCollections.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class duyetNguocIterator {

	public static void main(String[] args) {

		List<Integer> lst = Arrays.asList(new Integer[] {1, 4, 7, 8, 9, 6, 3, 2, 5});
		
		ListIterator<Integer> listIterator = lst.listIterator(lst.size());
		while(listIterator.hasPrevious());
		{
			System.out.print(listIterator.previous() +" ");
		}
		
	}

}
