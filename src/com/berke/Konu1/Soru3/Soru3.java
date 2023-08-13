package com.berke.Konu1.Soru3;

import com.berke.Konu1.Soru3.Cins;

public class Soru3 {	
	/*
	 * 'super' anahtar kelimesi alt bir sınıfın içinde üstteki bir sınıfla aynı adlı olan şeyleri çağırmak için kullanılır.
	 */
	
	public static void main(String[] args) {
		Cins cins = new Cins("Kedi", "İran Kedisi");
		cins.belirt();
		cins.detayliBelirt();
	}
}
