package Calender_Handling;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettingTomorrowsDate {

	public static void main(String[] args) throws InterruptedException {
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		cal.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println("System Date="+d);    //upto here system format date&time will appears
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy day");
		String modifiedDate=sdf.format(d);
		System.out.println(modifiedDate);
	}

}
