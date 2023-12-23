package communityuni.com.model;

public enum XepLoai {
	Gioi ("Giỏi"),
	Kha ("Khá"),
	TrungBinh ("Trung Bình"),
	Kem ("Kém");
	
	private String mgs;
	
	XepLoai(String mgs){
		this.mgs = mgs;
		
	}
	public String description() {
		return this.mgs;
	}
	
}
