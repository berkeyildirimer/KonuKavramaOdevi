package com.berke.Konu4.Soru3;

public class Soru3 {
	
	public static void main(String[] args) {
	
	/*
	 * Statik: Bu durumda hangi methodun çağrılacağı derleme zamanında belli olur
	 * Dinamik: Bu durumda hangi methodun çağrılacağı çalışma zamanında belli olur
	 */
	Hayvan hayvan1 = new Kopek();
    Hayvan hayvan2 = new Kedi();
    
    hayvan1.sesCikar(); 
    hayvan2.sesCikar(); 
	}
}