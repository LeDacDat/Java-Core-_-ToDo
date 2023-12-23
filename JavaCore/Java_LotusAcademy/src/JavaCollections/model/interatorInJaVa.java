package JavaCollections.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class interatorInJaVa {

	public static void main(String[] args) {
		
		/*HashMap<String, String> map = new HashMap<String, String>();
		map.put("Ha Noi", "Viet Nam");
		map.put("Han Quoc", "Seoul");
		map.put("Russia", "Moscow");
		
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext())
		{
			var item = iterator.next();
			System.out.println(item.getKey() + " -------- " +item.getValue());
		}*/
		
		/*List<String> lst = new ArrayList<>();
		lst.add("le Dac Dat");
		lst.add("Le Anh Dung");
		lst.add("Pham Tri Nghia");
		
		Iterator<String> iterator = lst.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}*/
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(1, "Le Dac Dat");
		map.put(2, "Le Anh Dung");
		map.put(3, "Pham Tri Nghia");
		
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext())
		{
			var item = iterator.next();
			System.out.println(item.getKey() + "-------" + item.getValue());
		}
		
	}

}
