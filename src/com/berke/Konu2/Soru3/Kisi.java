package com.berke.Konu2.Soru3;

	public class Kisi {
		String ad;
		int yas;

	Kisi(String ad, int yas) {
		this.ad = ad;
		this.yas = yas;
 }

	Kisi(Kisi digerKisi) {
		this.ad = digerKisi.ad;
		this.yas = digerKisi.yas;
 }

	void goster() {
		System.out.println("Ad: " + ad + ", Yaş: " + yas);
 }
}

