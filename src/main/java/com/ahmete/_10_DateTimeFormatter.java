package com.ahmete;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _10_DateTimeFormatter {
	public static void main(String[] args) {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate yasGunu=LocalDate.of(2017,12,5);
		System.out.println("formatsız localDate: "+yasGunu);
		System.out.println("formatlı localDate: "+yasGunu.format(dtf));
	}
}