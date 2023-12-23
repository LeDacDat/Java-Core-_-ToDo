package JavaCore.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class NgayThangNam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calendar cal = Calendar.getInstance();
		cal.setTimeZone(TimeZone.getTimeZone("GMT+7"));
		System.out.println("Gio hien tai la:" +cal.get(Calendar.HOUR) +":" +cal.get(Calendar.MINUTE)+":" + cal.get(Calendar.SECOND));
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(now);
		System.out.println(time);*/
		
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy - HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
	}

}
