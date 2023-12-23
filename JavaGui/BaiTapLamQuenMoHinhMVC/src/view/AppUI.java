package view;

import lib.InputHelper;
import model.HocSinh;
import services.AppServices;

public class AppUI {
	
	private AppServices app;
	
	public AppUI(){
		app = new AppServices();
		menu();
	}
	
	private void menu() {
		System.out.println("---------------------------------------");
		System.out.println("1.Them moi hoc sinh");
		System.out.println("2.Sua thong tin theo id");
		System.out.println("3.Xoa thong tin theo id");
		System.out.println("4.In toan bo hoc sinh");
		System.out.println("5.Thoat chuong trinh!");
		int request = InputHelper.intHelper("Nhap lua chon:", "Lua chon khong hop le!");
		controller(request);
	}
	
	private void controller(int request) {
		switch(request) {
		case 1:
			app.addNew(new HocSinh());
			break;
		case 2:
			app.remakeHocSinh(new HocSinh()	, InputHelper.intHelper("Nhap id can sua:", "Loi Nhap sai du lieu!"));
			break;
		case 3:
			app.deleteHocSinh(InputHelper.intHelper("Nhap id can xoa:", "Loi nhap sai du lieu!"));
			break;
		case 4:
			app.showEverything();
			break;
		case 5:
			System.exit(0);
		}
		menu();
	}

}
