package JavaCollections.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kiemTraSoTang {
	
	public static boolean checkTang(int so)
	{
		
		char[] arr = Integer.toString(so).toCharArray();
		for(int i = 0;i<arr.length-1;i++) {
			if(Character.getNumericValue(arr[i+1]) < Character.getNumericValue(arr[i]));
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		lst.addAll(Arrays.asList(new Integer[] {123, 421, 723, 89, 90, 61, 33, 22, 54}));
		System.out.println("Cac phan tu tang la:");
		for (Integer x : lst) {
			
			if(checkTang(x))
				System.out.println(x + " ");
		}

	}

}
