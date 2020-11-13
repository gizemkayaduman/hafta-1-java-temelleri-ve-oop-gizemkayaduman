package soru6;

import soru6.PDFDocument;
import soru6.WordDocument;

public class Printer {
	
    /*static fonksiyonlar nesnelere değil sınıflara bağlıdır. Yani nesneden nesneye değişmez ve hepsinde aynıdır.
	print fonksiyonu da bütün nesneler için aynı olduğundan static tanımlamak uygundur.*/
	
	public static void printPDFDocument(PDFDocument pdfDocument) {
		System.out.println("Body: " + pdfDocument.getBody());
	}
	
	public static void WordDocument(WordDocument wordDocument) {
		System.out.println("Body: " + wordDocument.getBody());
	}

	

}
