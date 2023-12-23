package algorithm.model;

import java.util.HashSet;
import java.util.Set;

public class SubStringMax {
	
	public  static int lenghtOfSubTringMax(String s) {
		
		int maxl = 0;
		int l = 0;
		
		Set<Character> set = new HashSet<>();
		
		for(int r = 0 ; r<s.length() ; r++) {
			
			if(!set.contains(s.charAt(r))) {
				set.add(s.charAt(r));
				maxl = Math.max(maxl, r - l +1);
			}
			else {
				while(s.charAt(l)!= s.charAt(r)) {
					set.remove(s.charAt(l));
					l++;
				}
				set.remove(s.charAt(l));
				l++;
				set.add(s.charAt(r));
			}
		}
		
		return maxl;
		
		
	}
		

	public static void main(String[] args) {
		String str = "ledacdatdatledac";
		System.out.println("Max subtring = "+lenghtOfSubTringMax(str));

	}

}
