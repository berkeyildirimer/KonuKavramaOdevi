package com.berke.Konu1.Soru3;

public class Cins extends Hayvan{
	
	String cins;

	public Cins(String tur, String cins) {
		
		super(tur);
		this.cins = cins;
	}
	  public void detayliBelirt() {
	        System.out.println("Bu hayvan bir " + tur + "'dir ve cinsi " + cins + "'dir.");
	    }

}
