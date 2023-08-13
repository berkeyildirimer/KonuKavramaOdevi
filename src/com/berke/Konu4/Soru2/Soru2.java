package com.berke.Konu4.Soru2;

public class Soru2 {
	/*
	 * Bir interface Java'da çok biçimliliği uygulamak için kullanılan bir arayüzdür. Interface bir sınıfın belirli methodları 
	 * implemente etmesini sağlar. Interfaceler sayesinde farklı sınıfları aynı tür gibi kullanabiliriz.
	 */

    public static void main(String[] args) {
        IArac arac1 = new Araba();
        IArac arac2 = new Motorsiklet();

        arac1.hareketEt();
        arac2.hareketEt();
    }
}