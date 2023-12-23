package JavaMeThod.model;

import java.util.Arrays;

public class timSoNhoNhat {
	
	 public static void main(String[] args) {
	        int n = 846903;
	        int[] digits = mangChuSo(n);
	        Arrays.sort(digits);
	        int startIndex = digits[0] == 0 ? 1 : 0;
	        int[] sortedDigits = Arrays.copyOfRange(digits, startIndex, digits.length);
	        int result = ghepSo(sortedDigits);
	        System.out.println(result);
	    }

	    public static int[] mangChuSo(int n) {
	        String numberString = String.valueOf(n);
	        int[] digits = new int[numberString.length()];
	        for (int i = 0; i < digits.length; i++) {
	            digits[i] = Character.getNumericValue(numberString.charAt(i));
	        }
	        return digits;
	    }

	    public static int ghepSo(int[] arr) {
	        int result = 0;
	        for (int i = 0; i < arr.length; i++) {
	            result = result * 10 + arr[i];
	        }
	        return result;
	    }

}
