package com.ahmete;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _03_LocalDate {
	public static void main(String[] args) {
		
		// tarih bilgisini getirir
//		LocalDate localDate=LocalDate.now(); // 2024-08-20
		LocalDate localDate=LocalDate.of(2024,6,26); //LocalDate.of ile istediğimiz bir tarihte verebiliriz
		System.out.println(localDate);
		System.out.println(localDate.getYear()); // 2024
		System.out.println(localDate.getMonth()); //AUGUST
		System.out.println(localDate.getMonthValue()); // 8
		System.out.println(localDate.getDayOfWeek()); // TUESDAY
		System.out.println(localDate.getDayOfMonth()); // 20
		System.out.println(localDate.getDayOfYear()); // 233
		System.out.println(localDate.getEra()); //CE: Milattan sonra
		
		LocalDate localDateYarin =localDate.plusDays(1);
		System.out.println(localDateYarin);
		
		LocalDate ikiHaftaSonrasi =localDate.plusWeeks(2);
		System.out.println(ikiHaftaSonrasi);
		
		LocalDate ucAySonrasi =localDate.plusMonths(3);
		System.out.println(ucAySonrasi);
		
		LocalDate tarih1=LocalDate.of(2024,2,29);
		System.out.println(tarih1.minusDays(5));
		
		//100 yıl önce bugun
		System.out.println(LocalDate.now().minusYears(100));
		
		//ChronoUnit sınıfı kullanarak yaptık
		System.out.println(LocalDate.now().minus(100, ChronoUnit.YEARS));
		System.out.println(LocalDate.now().plus(100, ChronoUnit.YEARS));
		
		//12 taksitli bir satış işlemi gercekleşti. ödemeler  30 gunde bir olacak ödeme günlerini listeleyiniz
		LocalDate baslangictarihi=LocalDate.now();
		for (int i = 0; i <=12 ; i++) {
			LocalDate odemeTarihi=baslangictarihi.plusDays(30*i);
			System.out.println((i+1)+". Tksit tarihi: "+odemeTarihi);
			
		}
		
		//String gelen tarihi parse ile localDate e cevirme
		LocalDate parseEdilmisTarih = LocalDate.parse("2008-05-28");
		System.out.println(parseEdilmisTarih.plusDays(2));
		
		System.out.println("------------------------------------------");
		
		
		
	}
}