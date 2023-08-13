package com.berke.Konu5.Soru1;

public abstract class Hayvan {

	public String ad;
	public String tur;
	public int yas;
	
	public void hayvanBilgileriniYazdir() {
		System.out.println("Hayvan Adı: "+ad+"\nHayvan Türü: "+tur);
	}
	
	abstract void yasamSuresi();
	
}
