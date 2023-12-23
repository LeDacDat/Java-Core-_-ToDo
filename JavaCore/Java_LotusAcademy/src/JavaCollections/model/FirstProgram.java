package JavaCollections.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FirstProgram {
	
	private static double avgNum(int a[])
	{
		double sum = 0;
		for (int i : a) {
			sum+=i;
		}
		return sum/a.length;
	}
	public static void sortedByAvg(int [][] a)
	{
		Arrays.sort(a, new Comparator<int []>(){
			
			public int compare(int a[], int b[]) {
				double x = avgNum(a);
				double y = avgNum(b);
				if(x >y)
					return -1;
				else if(x<y)
					return 1;
				else 
					return 0;
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		
		 int[][] arr = {{1, 2, 3}, {4, 5,6}, { 7, 8, 9}};
		 sortedByAvg(arr);
		for(int a[] : arr )
		{
			System.out.println(Arrays.toString(a));
		}
	}
}
