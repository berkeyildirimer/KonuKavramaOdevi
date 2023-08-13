package com.berke.Konu5.Soru3.Interface;

public class Soru3 {
	
	/*
	 * Interfaceler çoklu miras(kalıtım) gibi bir işlem yapmak istediğimizde kullanılıyorlar. Methodların isimleri aynı oluyor, ama
	 * davranışları farklı oluyor.
	 */
	
    public static void main(String[] args) {
        IArac arac1 = new Araba();
        IArac arac2 = new Motorsiklet();

        arac1.hareketEt();
        arac2.hareketEt();
    }
}
