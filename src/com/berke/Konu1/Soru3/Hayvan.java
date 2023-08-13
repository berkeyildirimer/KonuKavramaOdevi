package com.berke.Konu1.Soru3;

public class Hayvan {
	
	String tur;

	public Hayvan(String tur) {
		this.tur = tur;
	}

	public void belirt() {
        System.out.println("Bu hayvan bir " + tur +"'dir.");
    }

}
