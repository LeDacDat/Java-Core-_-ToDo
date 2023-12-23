package btvn_java_HMD;

import java.util.Arrays;

public class MangDaChieu {

	public static void main(String[] args) {
		
		
		String names[] = {"alex", "brand", "David", "Lee"};
		
		//String[] namesofClone = names.clone();
		String copyofName[] = Arrays.copyOf(names, names.length);
		
		for(String value : copyofName) {
			System.out.print(value +" ");
		}

	}

}
