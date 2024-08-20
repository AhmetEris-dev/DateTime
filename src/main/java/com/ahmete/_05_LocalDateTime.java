package com.ahmete;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _05_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime ltd=LocalDateTime.now();
		System.out.println(ltd);
		
		LocalDateTime localDateTime=LocalDateTime.of(2024,10,5,10,30);
		
		LocalDate localDate=LocalDate.of(2024,10,5);
		LocalTime localTime=LocalTime.of(10,30);
		
		LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
		System.out.println(localDateTime1);
	}
}