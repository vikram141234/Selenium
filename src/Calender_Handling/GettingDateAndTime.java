package Calender_Handling;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GettingDateAndTime {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		Date Date = Calendar.getInstance().getTime();
		System.out.println("System Date="+Date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		String d=sdf.format(Date);
		System.out.println(d);
		
		
		
		
		

	}

}
