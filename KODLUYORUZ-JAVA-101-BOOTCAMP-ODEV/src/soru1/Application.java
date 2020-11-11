package soru1;

import java.util.Scanner;

public class Application {

public static void main(String[] args) {
		
		String password = "12345";
		
		System.out.print("Bir şifre giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String incomingPassword = scanner.next();
		
		boolean result = incomingPassword.equals(password);
		
		if(result == true) {
			System.out.print("Giriş Başarılı!");
		}
		else
			System.out.print("Giriş Başarısız");
		}
	
		
	}


