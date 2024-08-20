package com.ahmete;

import java.time.Duration;
import java.time.Instant;
/*
iki zaman arasındaki farkı bulmak için duration kullanabilirsin
 */

public class _08_Instant_Duration {
	public static void main(String[] args) {
		
		long islemAdet=5_000_000_000L;
		long toplam=0;
		
		//1.Yöntem System.currentTimeMillis()
		long start=System.currentTimeMillis();
		for (long i = 0; i <islemAdet ; i++) {
			toplam+=i;
		}
		System.out.println(toplam);
		long end=System.currentTimeMillis();
		System.out.println((end-start+" ms: "));
		
		//2.yöntem: System.nanoTime();
		toplam=0;
		 start=System.nanoTime();
		for (long i = 0; i <islemAdet ; i++) {
			toplam+=i;
		}
		System.out.println(toplam);
		 end=System.nanoTime();
		System.out.println((end-start+" ns: "));
		
		//3.yöntem: Instant.now()
		toplam=0;
		Instant baslangic = Instant.now();
		for (long i = 0; i <islemAdet ; i++) {
			toplam+=i;
		}
		System.out.println(toplam);
		Instant bitis=Instant.now();
		Duration between = Duration.between(baslangic, bitis);
		System.out.println(between);
		System.out.println(between.toMillis()+" ms: ");
		System.out.println(between.toSeconds()+" s: ");
		System.out.println(between.toNanos()+" ns: ");
		
	}
}