package itforstudent;

import java.util.Collection;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.HashMap<Integer, String> map = new java.util.HashMap<Integer, String>();
		map.put(1, "Dat");
		map.put(2, "Trang");
		map.put(3, "Trong");
		map.put(4, "That");
		map.put(5, "Su");
		
		Collection<String> dsTen = map.values();
		
		for( String ten : dsTen) {
			System.out.println(ten);
		}
		
		System.out.println("Danh sach ma la:");
		Set<Integer> dsMa = map.keySet();
		
		for(int ma : dsMa) {
			System.out.println(ma);
		}
		
		String ten = map.get(4);
		System.out.println(ten);
		
		if(map.containsKey(4)==false)
			map.put(4, "Huhu");
		
		map.remove(2);
		System.out.println("-----------------Sau khi Xoa -------------------");
		for(String ten1 : dsTen) {
			System.out.println(ten1);
		}
		
		map.clear();
		System.out.println("So phan tu con lai "+ map.size());
	}

}
