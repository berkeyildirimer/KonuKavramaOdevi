package com.berke.Konu5.Soru1;

public class Soru1 {
	/*
	 * Soyut sınıflar büyük projelerde kullanılırlar ve kalıtım özelliğini kullanarak kod tekrarını azaltırlar. 
	 * Soyut sınıflar diğer sınıflara taban olmak için kullanılırlar ve nesne türetemezler.
	 */
	
	public static void main(String[] args) {
		
		Kedi kedi=new Kedi();
		kedi.ad="Bubbles";
		kedi.tur="Kedi";
		kedi.hayvanBilgileriniYazdir();
		kedi.yasamSuresi();
		System.out.println();
		Kopek kopek=new Kopek();
		kopek.ad="Misha";
		kopek.tur="Köpek";
		kopek.hayvanBilgileriniYazdir();
		kopek.yasamSuresi();
		
		
	}
}