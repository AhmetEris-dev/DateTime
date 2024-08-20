package com.ahmete;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _04_LocalTime {
	public static void main(String[] args) {
		
		// zaman bilgisini getiriyor
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime); // 09:47:51.345581500
		
		LocalTime localTime1=LocalTime.of(02,15,30);
		System.out.println(localTime1);
		System.out.println(localTime1.getHour());
		System.out.println(localTime1.getMinute());
		System.out.println(localTime1.getSecond());
		System.out.println(localTime1.getNano());
		
		System.out.println("iki saat sonra: "+localTime1.plusHours(2));
		System.out.println("iki saat sonra: "+localTime1.plus(2, ChronoUnit.HOURS));
		System.out.println("30 DK önce: "+localTime1.minus(30, ChronoUnit.MINUTES));
	}
}