package com.berke.Konu3.Soru1;

public class Soru1 {
	/*
	 * Kapsülleme bir sınıfın içindeki veri ve methodları dışarıya karşı gizlemek için kullanılır ve sınıfın iç yapısının
	 * değişiklerden etkilenmemesi için kullanılır.
	 */
	public static void main(String[] args) {
		
		Hayvan hayvan = new Hayvan();
		hayvan.tur = "Kedi";
		System.out.println(hayvan.tur + " ");		
	}
}
