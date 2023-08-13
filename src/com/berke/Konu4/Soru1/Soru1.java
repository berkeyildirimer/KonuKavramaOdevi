package com.berke.Konu4.Soru1;

public class Soru1 {
	/*
	 * Polymorphism (aynı isimli) bir nesnenin farklı şekillerde davranabilme yeteneğini ifade eder.
	 */
	
	    public static void main(String[] args) {
	        Hayvan hayvan1 = new Hayvan();
	        Hayvan hayvan2 = new Kedi();
	        Hayvan hayvan3 = new Kopek();

	        hayvan1.sesCikar(); 
	        hayvan2.sesCikar(); 
	        hayvan3.sesCikar();
	    }
}


