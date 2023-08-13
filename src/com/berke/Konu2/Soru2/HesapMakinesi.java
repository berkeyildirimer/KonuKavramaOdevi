package com.berke.Konu2.Soru2;

	public class HesapMakinesi {
		int sonuc;

    HesapMakinesi(int sayi1, int sayi2) {
        sonuc = sayi1 + sayi2;
    }

    HesapMakinesi(int sayi1, double sayi2) {
        sonuc = (int) (sayi1 * sayi2);
    }

    void sonucGoster() {
        System.out.println("Sonuç: " + sonuc);
    }
}