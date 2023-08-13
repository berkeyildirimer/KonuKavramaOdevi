package com.berke.Konu3.Soru2;

public class Soru2 {
	
	/*
	 * Public: Tüm sınıflar erişebilir
	 * Private: Sadece aynı sınıfın içinden erişilebilir
	 * Protected: Aynı paket içindeki sınıflar yada alt sınıflarından erişilebilir.
	 */
	public static void main(String[] args) {
		Hayvan hayvan = new Hayvan();
		hayvan.tur = "Kedi";
		System.out.println(hayvan.tur);
		//hayvan.cins(); private olduğu için erişilemiyor
		hayvan.yas();
	}
}
