package soru2;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("----YAPMAK İSTEDİĞİNİZ İŞLEMİ ŞEÇİNİZ----");
		System.out.println("1.Toplama");
		System.out.println("2.Çıkarma");
		System.out.println("3.Çarpma");
		System.out.println("4.Bölme");
		System.out.println();
		System.out.print("Seçiminiz: ");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if(choice<1 || choice>4) {
			System.out.print("Yanlış seçim yaptınız!!");
			System.exit(0);
		}
		
		System.out.print("1. sayıyı giriniz: ");
		int number1 = scanner.nextInt();
		System.out.print("2. sayıyı giriniz: ");
		int number2 = scanner.nextInt();
		
	    if(choice == 1) {
			int result = number1 + number2;
			System.out.print("Sayıların toplamı: " + result);
		}
		else if(choice == 2) {
			int result = number1 - number2;
			System.out.print("Sayıların farkı: " + result);
		}
		else if(choice == 3) {
			int result = number1 * number2;
			System.out.print("Sayıların çarpımı: " + result);
		}
		else if(choice == 4) {
			int result = number1 / number2;
			System.out.print("Sayıların bölümü: " + result);
		}
		
		
		scanner.close();
	}

}
