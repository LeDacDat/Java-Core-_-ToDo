package algorithm.model;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] HaiTong(int[] nums, int tar) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<nums.length;i++) {
			int comp = tar - nums[i];
			if(map.containsKey(comp)) {
				return new int [] {map.get(comp),i};
			}
			map.put(nums[i], i);
		}
		return new int [] {-1,-1};
	}

	public static void main(String[] args) {
		int[] nums = {3,4,5,6,7};
		int[] result = HaiTong(nums, 10);
		
		if(result.length==0)
			System.out.println("ket qua la null!");
		else{
			System.out.println("Ket qua la:" +result[0] + "," + result[1]);
		}
		
	}

}
