package services;

import java.util.ArrayList;
import java.util.List;

import model.HocSinh;

public class AppServices implements AppHocSinhInTerFace{
	
	private List<HocSinh> db;

	public AppServices() {
		db = new ArrayList<>();
	}

	@Override
	public boolean addNew(HocSinh input) {
		for (HocSinh hocSinh : db) {
			
			if(hocSinh.getId()==input.getId()) {
				System.out.println("Them that bai!");
				return false;
			}				
		}
		db.add(input);
		System.out.println("Them Thanh Cong!");
		return true;

	}

	@Override
	public boolean remakeHocSinh(HocSinh dataNew, int id) {
		for(int i = 0;i<db.size();i++) {
			if(db.get(i).getId() == id) {
				db.set(i, dataNew);
				System.out.println("Them thanh cong!");
				return true;
			}
		}
		System.out.println("Sua that bai id khong ton tai!");
		return false;
	}

	@Override
	public boolean deleteHocSinh(int id) {
		
		for (HocSinh hocSinh : db) {
			if(hocSinh.getId()==id)
			{
				db.remove(hocSinh);
				System.out.println("Xoa Thanh cong!");
				return true;
			}
		}
		System.out.println("Xoa that bai id khong ton tai!");
		return false;
	}

	@Override
	public boolean showEverything() {
		if(db.size() ==0) {
			System.out.println("Khong co du lieu!");return false;
			
		}
		for (HocSinh hocSinh : db) {
			hocSinh.showInfo();
		}
		return true;
		
	}
	

}
