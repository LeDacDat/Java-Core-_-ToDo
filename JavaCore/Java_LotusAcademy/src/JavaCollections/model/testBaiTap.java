package JavaCollections.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class testBaiTap {
	
	public static void sortedPhanTuLe(int arr[])
	{
		List<Integer> listLe = new ArrayList<>();
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] %2 !=0)
				listLe.add(arr[i]);
		}
		
		Collections.sort(listLe);
		
		int j = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] %2 == 0)
				continue;
			arr[i] = listLe.get(j++);
		}
	}
	
	public static void main(String[] args) {
			 
		int arr[]= {2,1,5,6,3,9,8,10,7};
		sortedPhanTuLe(arr);
		System.out.print(Arrays.toString(arr));
	}

}
