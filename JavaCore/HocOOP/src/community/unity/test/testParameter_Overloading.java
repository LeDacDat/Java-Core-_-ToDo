package community.unity.test;

public class testParameter_Overloading {
	
	public static int Sum(int ...arr) {
		
		int s = 0;
		for(int i=0;i<arr.length;i++) {		
			s+=arr[i];
		}
		return s;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=Sum(1,2,3,4,5);
		System.out.println(s);
		int s1= Sum();
		System.out.println(s1);
	}

}
