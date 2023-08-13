package com.berke.Konu2.Soru3;

public class Soru3 {

	public static void main(String[] args) {
		/*
		 * Copy constructor, bir sınıfın varolan bir nesnesinin verilerini kullanarak 
		 * yeni bir nesne oluşturmak için kullanılan bir constructor türüdür. Yani nesne kopyalamaya yada klonlamaya kullanılıyor
		 */
	  
		Kisi kisi1 = new Kisi("Ahmet", 30);      
		Kisi kisi2 = new Kisi(kisi1);
		  
		kisi1.goster(); 	      
		kisi2.goster(); 	  
	}
}

