package soru5;

public class Application {

	public static void main(String[] args) {
		
		int[] randomArray = new int[100];
		
		
		//diziyi random sayılarla doldurur.
		for(int i=0; i< randomArray.length; i++) {
			randomArray[i]= (int)(Math.random()*100);
		}
		

		for(int i = 0; i < randomArray.length; i++) {
			System.out.print(randomArray[i] + " ");
		}
		System.out.println();
		
		
		
		System.out.println("Çift Sayılar: ");
		for(int i=0; i<randomArray.length; i++) {
			if(randomArray[i]%2==0) {
				System.out.print(randomArray[i] + " ");
			}
			
		}
		
		System.out.println();
		System.out.println("Tek Sayılar: ");
		for(int i=0; i<randomArray.length; i++) {
			if(randomArray[i]%2==1) {
				System.out.print(randomArray[i] + " ");
			}
			
		}

	
}
}
