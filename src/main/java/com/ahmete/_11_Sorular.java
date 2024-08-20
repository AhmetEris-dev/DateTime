package com.ahmete;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class _11_Sorular {
	public static void main(String[] args) {
		//Soru1: Doğum tarihiniz hangi gündür yazdırınız. Pazartesi Salı gibi.
		LocalDate dt = LocalDate.of(2000, 10, 12);
		
		
		System.out.println(dt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CHINA));
		
		Locale localeTR = new Locale("tr", "TR");
		Locale tr = Locale.of("tr", "TR");
		System.out.println(dt.getDayOfWeek().getDisplayName(TextStyle.FULL, tr));
		
		System.out.println(dt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE");
		System.out.println(dtf.format(dt));
		
		//Soru 2: Restoran Rezervasyon sisteminde müşteri belirli bir tarih ve saate rezervasyon yapabiliyor.
		//Ama restoran saat 23:00'de kapanıyor ve saat 10:00'da açılıyor.
		// Seçilen rezervasyon saatinin bu aralıkta olduğunu kontrol eden bir metod yazınız.
		// Eğer bu aralıkta değilse false dönsün.
		// Eğer bu aralıktaysa true dönebilir.
		
		boolean b = rezervasyonSaatiGecerliMi(LocalDateTime.of(2024, 8, 20, 22, 59));
		System.out.println(b);
	}
	
	public static boolean rezervasyonSaatiGecerliMi(LocalDateTime rezervasyonZamani) {
		LocalTime acilisSaati = LocalTime.of(10, 0);
		LocalTime kapanisSaati = LocalTime.of(23, 0);
		
		LocalTime rezervasyonSaati = rezervasyonZamani.toLocalTime();
		
		return (rezervasyonSaati.isAfter(acilisSaati) && rezervasyonSaati.isBefore(kapanisSaati));
		
	}
	
}