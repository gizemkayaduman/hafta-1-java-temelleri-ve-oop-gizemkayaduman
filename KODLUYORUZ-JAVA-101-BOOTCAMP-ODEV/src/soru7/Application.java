package soru7;


public class Application {

	public static void main(String[] args) {
		
		Report newReport = new Report();
		newReport.setName("iş akış raporu");
		System.out.println(newReport.getName());
		
		newReport.setResult("burası result alanı");
		System.out.println(newReport.getResult());
		
		newReport.setDate();
		System.out.println(newReport.getDate());

	}

}
