package soru7;

public class Printer {

	public static void print(Report report) {
		System.out.println("Name: " + report.getName());
		System.out.println("Result: " + report.getResult());
		System.out.println("Date: " + report.getDate());
	}
}
