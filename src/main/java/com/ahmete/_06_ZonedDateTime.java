package com.ahmete;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class _06_ZonedDateTime {
	public static void main(String[] args) {
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt); // 2024-08-20T10:45:57.407890600+03:00[Europe/Istanbul]
		
		LocalDateTime localDateTime = LocalDateTime.of(2024, 8, 20, 10, 49);
		
		ZonedDateTime PyongDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Pyongyang"));
		System.out.println(PyongDateTime);
		
		System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Pyongyang")));
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Adak")));
		
		AtomicInteger sayac=new AtomicInteger(1);
		ZoneId.getAvailableZoneIds().forEach(zone-> {
			System.out.println(sayac+" - "+zone);
			sayac.getAndIncrement();
		});
		System.out.println(ZoneId.getAvailableZoneIds().stream().count());
	}
}