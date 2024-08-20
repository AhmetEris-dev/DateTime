package com.ahmete;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/*
date ve calendar ı formatlamak için kullanabiliriz.
 */
public class _09_SimpleDateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("(dd-MM) hh:mm:ss");
		System.out.println(sdf.format(date));
		
		System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(date));
		
		Calendar calendar=Calendar.getInstance();
		System.out.println(sdf.format(calendar.getTime()));
		
		
		
		/*LocalDateTime localDate=LocalDateTime.now();
		System.out.println(sdf.format(localDate));*/
	}
}