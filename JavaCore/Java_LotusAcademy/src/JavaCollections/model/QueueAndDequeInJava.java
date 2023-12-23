package JavaCollections.model;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAndDequeInJava {

	public static void main(String[] args) {
		
		/*Queue<String> danhSach = new LinkedList<>();
		
		danhSach.offer("Le Dac Dat");
		danhSach.offer("Pham Tri Nghia");
		danhSach.offer("Le Anh Dung");
		
		while(true)
		{
			String ten = danhSach.poll();
			if(ten == null)
				break;
			
			System.out.println(ten);
		}*/
		
		// priorityQueue
		
		/*Queue<String> danhSach = new PriorityQueue<>();

		danhSach.offer("Le Dac Dat");
		danhSach.offer("Pham Tri Nghia");
		danhSach.offer("Le Anh Dung");
		
		while(true)
		{
			String ten = danhSach.poll();
			if(ten == null)
				break;
			
			System.out.println(ten);
	 }*/
		
		Deque<String>  danhSach = new ArrayDeque<>();
		
		danhSach.offer("Le Dac Dat");
		danhSach.offer("Pham Tri Nghia");
		danhSach.offer("Le Anh Dung");
		danhSach.offerFirst("Ahihihi");
		danhSach.offerLast("Ahuhu");
		
		
		while(true)
		{
			String ten = danhSach.poll();
			if(ten == null)
				break;
			
			System.out.println(ten);
	 }
	}
}
