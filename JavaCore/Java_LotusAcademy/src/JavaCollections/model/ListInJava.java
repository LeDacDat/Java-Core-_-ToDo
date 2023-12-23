package JavaCollections.model;

import java.util.ArrayList;
import java.util.List;



public class ListInJava {

	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<>();
		listInt.add(2);
		listInt.add(3);
		listInt.add(4);
		listInt.add(5);
		listInt.add(6);
		listInt.add(7);
		listInt.add(8);
		List<Integer> newList = new ArrayList<>();
		for(int i = 0;i<listInt.size();i++)
		{
			int x = listInt.get(i)*listInt.get(i);
			newList.add(x);
		}
		System.out.print("danh sach vua tao la:" +listInt);
		System.out.println();
		int count = 0;
		for(int i = 0;i<newList.size();i++)
		{
			if(newList.get(i) >=20)
				count++;
		}
		System.out.print("Danh sach moi la:" +newList);
		System.out.println();
		System.out.println("So phan tu lon hon 20 :" + count);
	}

}
