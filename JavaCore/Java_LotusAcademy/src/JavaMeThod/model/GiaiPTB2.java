package JavaMeThod.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GiaiPTB2 {
	
	public static void doiGio(int hour)
	{
		long minutes = TimeUnit.HOURS.toMinutes(hour);
		long second = TimeUnit.MINUTES.toSeconds(minutes);
		System.out.format("%d gio bang %d phut , %d giay", hour,minutes, second);
		
	}
	
	public static String timKiTuOGiua(String str) {
		
		int index ;
		int lenght;
		
		if(str.length() %2 == 0)
		{
			index = str.length()/2 -1;
			lenght = 2;
		}
		else {
			index = str.length()/2;
			lenght = 1;
		}
		
		return str.substring(index, index+lenght);
		
	}

	public static void main(String[] args) {
		String str = "kkcckk";
		System.out.println("Ki tu o giua la:" + timKiTuOGiua(str));
	}

}
