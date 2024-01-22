package Calender_Handling;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class gettingdateTime {

	public static void main(String[] args) {
		//Optimized Way
		Calendar cal=Calendar.getInstance();
		Date d=Calendar.getInstance().getTime();      //optimized way
		System.out.println("System Date="+d);                 //upto here system format date&time will appears
		
		/*To get required Date in Format*/
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		String modifiedDate=sdf.format(d);
		System.out.println("System Date After Modified="+modifiedDate);
		
		
		
/*		
		  //Normal Way 
		Calendar cal=Calendar.getInstance(); 
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy"); 
		String modifiedDate=sdf.format(d); 
		System.out.println(modifiedDate);
*/		 
	}

}
