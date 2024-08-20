package com.ahmete;

import java.util.Date;
/*
Date class içindeki cogu metod deprecated olmuş durumdadır
Yani yeni java versiyonlarında tamamen kaldırılma ihtimali vardır.
 */
public class _01_DateClass {
	public static void main(String[] args) {
		System.out.println(new Date()); // Tue Aug 20 09:26:28 TRT 2024
		Date date=new Date();
		System.out.println("Tarih: "+date.getTime()); // 1724135605980
		System.out.println("CurrentTime: "+System.currentTimeMillis());
		System.out.println(date.getDay()); //haftanın kacıncı gunu bilgisi, Pazar:0,Pazartesi:1....
		System.out.println(date.getMonth()); //yılın kacıncı ayı bilgisi, Ocak:0, şubat:1 ....
	}
}