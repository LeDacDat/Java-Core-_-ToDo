package Services;

import model.Meo;
import model.MeoAnhLongDai;

public interface QuanLyMeoInterface {
	
	public boolean themMeo(MeoAnhLongDai newMeo);
	public boolean xoaMeoTheoID(int id);
	public boolean hienThiToanBoMeo();
	public boolean hienThiMeoTheoID(int id);
	public boolean thayDoiTiengKeu(MeoAnhLongDai dataNew,int id);

}
