package JavaCore.model;

public class StringBasicInjava {

	public static void main(String[] args) {
		// Equals so sanh phan biet chu hoa, chu thuong tra ve gia trij boolean
		String name1 = "ledat";
		String name2 = "LeDat";
		String name3 = "ledat";
		
		System.out.println("name1 equals name 2 :" + name1.equals(name2));
		System.out.println("name1 equals name3 :" + name1.equals(name3));
		// equalsIsnoreCase so sanh ko phan biet chu hoa tra ve gia tri boolean
		System.out.println("name1 equalsIsNoreCase name2:"+name1.equalsIgnoreCase(name2));
		
		//compareTo so sanh tra ve int trong ascII;
		//comepareToIsNoreCase so sanh ko phan biet ki tu hoa
		String sv1 = "LeDacDat";
		String sv2 = "Ledacdat";
		String sv3 = "LeDanhDungkkkk";
		String sv4 = " dsada";
		
		System.out.println("sv1 compareTo sv2:"+ sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3 :" + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4:"+ sv1.compareTo(sv4));
		System.out.println("sv1 comepareToIsnoreCase sv2 :"+sv1.compareToIgnoreCase(sv2));
		
		// Ham regigonMatches => so sanh 1 doan trong chuoi
		
		String r1 = "TITV.vn";
		String r2 = "TV.vn";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);
		
		// ham starwith - kiem tra chuoi bat dau
		String sdt = "0365080477";
		System.out.println(sdt.startsWith("036"));
		System.out.println(sdt.startsWith("034"));
		
		//Ham endsWith =>kiem tra chuoi ket thuc
		String tenfile = "ledacdat.jpg";
		
		if(tenfile.endsWith("jpg"))
			System.out.println("Day la 1 file anh");
		else if(tenfile.endsWith("pdf"))
			System.out.println("day la file pdf");
	}
	

}
