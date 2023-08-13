package com.berke.Konu3.Soru3;

public class Soru3 {
	/*
	 * Getter ve setter metodları, sınıf içindeki private alanlara erişim sağlamak ve bu alanlara değer atamak için kullanılır.
	 */
	public static void main(String[] args) {
		Hayvan hayvan=new Hayvan();
		hayvan.setYas(5);
		hayvan.setAd("Bubbles");
		hayvan.setTur("Kedi");
		System.out.println("Adı: "+hayvan.getAd()+"\nYaşı: "+hayvan.getYas()+"\nTürü: "+hayvan.getTur());
	}
}
