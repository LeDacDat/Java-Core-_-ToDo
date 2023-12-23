package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lib.NhapDuLieu;
import model.Meo;
import model.MeoAnhLongDai;

public class QuanLyMeo implements QuanLyMeoInterface {

	
	private List<Meo> dsMeo;
	private List<MeoAnhLongDai> dsMeoAnh = new ArrayList<>();
	
	public QuanLyMeo() {
		dsMeo = new ArrayList<>();
	}
	@Override
	public boolean themMeo(MeoAnhLongDai newMeo) {
		
		for (MeoAnhLongDai meo : dsMeoAnh) {
			if(meo.getId() == newMeo.getId())
			{
				System.out.println("Them that bai! Meo da ton tai!");
				return false;
			}		
			
		}
		dsMeoAnh.add(newMeo);
		System.out.println("Them thanh cong!");
		return true;
		
	}

	@Override
	public boolean xoaMeoTheoID(int id) {
		// TODO Auto-generated method stub
		for (MeoAnhLongDai meo : dsMeoAnh) {
			if(meo.getId()== id)
			{
				dsMeoAnh.remove(meo);
				System.out.println("Xoa thanh cong!");
				return true;
			}
		}
		System.out.println("Xoa That Bai!");
		return false;
	}

	@Override
	public boolean hienThiToanBoMeo() {
		// TODO Auto-generated method stub
		if(dsMeoAnh.size() == 0) {
			System.out.println("Danh sach rong!");
			return false;
		}
		for (MeoAnhLongDai meo : dsMeoAnh) {
			meo.showInfo();	
		}
		return true;
	}

	@Override
	public boolean hienThiMeoTheoID(int id) {
		if(dsMeoAnh.size() == 0) {
			System.out.println("Danh sach rong!");
			return false;
		}
		for (MeoAnhLongDai meo : dsMeoAnh) {
			if(meo.getId()== id) {
				meo.showInfo();
			}
		}
		return true;
	}

	@Override
	public boolean thayDoiTiengKeu(MeoAnhLongDai dataNew,int id) {
		for(int i = 0;i<dsMeoAnh.size();i++) {
			if(dsMeoAnh.get(i).getId() == id) {
				String s = NhapDuLieu.Nhap_Chuoi("Sua tieng keu:", "Loi");
				dsMeoAnh.get(i).setTiengKeu(s);
				dsMeoAnh.set(i, dataNew);
				System.out.println("Sua thanh cong!");
				return true;
			}
		}
		System.out.println("Sua that bai!");
		return false;
	}
	
	

}
