package soru6;

import soru6.PDFDocument;
import soru6.WordDocument;

public class Application {

	public static void main(String[] args) {
		
		PDFDocument newPDFDocument = new PDFDocument("....PDF belgesinin body bilgisi....");
		WordDocument newWordDocument = new WordDocument("....Word belgesinin body bilgisi....");
		
		
		//printPDFDocument metodu statik olduğundan nesne oluşturmadan sınıf üzerinden ulaşılabilir.
		Printer.printPDFDocument(newPDFDocument);
		
		//WordDocument metodu statik olduğundan nesne oluşturmadan sınıf üzerinden ulaşılabilir.
		Printer.WordDocument(newWordDocument);
				

	}

}
