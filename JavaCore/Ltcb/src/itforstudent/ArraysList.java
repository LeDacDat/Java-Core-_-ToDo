package itforstudent;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ds2 = new ArrayList<>();
		ArrayList<Double> ds3 = new ArrayList<>();
		ArrayList<String> ds1 = new ArrayList<>();
		//them phan tu vao arrays list
		ds1.add("Le Dac Dat");
		ds1.add("Nguyen Thi Huyen Trang");
		ds1.add("Tang Minh Phuong");
		ds1.add("Do Thi Hue");
		
		System.out.println("Danh sach vua tao la:");
		for(int i = 0; i<ds1.size();i++) {
			System.out.println(ds1.get(i));
		}
		//chen phan tu vao array list
		ds1.add(1, "Love");
		System.out.println("Danh sach vua chen la:");
		for(int i = 0; i<ds1.size();i++) {
			System.out.println(ds1.get(i));
		}
		//Xoa phan tu trong arrays list
		
		ds1.remove(4);
		System.out.println("Danh sach vua xoa la:");
		for(int i = 0; i<ds1.size();i++) {
			System.out.println(ds1.get(i));
		}
		// sua phan tu trong array list
		ds1.set(1, "Like");
		System.out.println("Danh sach vua sua la:");
		for(int i = 0; i<ds1.size();i++) {
			System.out.println(ds1.get(i));
		}
	}

}
