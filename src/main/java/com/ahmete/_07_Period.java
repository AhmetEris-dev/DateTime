package com.ahmete;

import java.time.LocalDate;
import java.time.Period;

/*
iki tarih arasınıdaki farkı bulmak için period kullanabilirsin
 */
public class _07_Period {
	public static void main(String[] args) {
		LocalDate dogumGunu=LocalDate.of(1990,1,1);
		Period gecenZaman = Period.between(dogumGunu, LocalDate.now());
		System.out.println(gecenZaman); //P34Y7M19D
		int years = gecenZaman.getYears();
		int months = gecenZaman.getMonths();
		int days = gecenZaman.getDays();
		System.out.println(years+" yıl "+months+" ay "+days+" günlük.");
		
		
		Period onBesGunlukPeriod = Period.of(0, 0, 15);
		System.out.println(dogumGunu.plus(onBesGunlukPeriod));
	}
}