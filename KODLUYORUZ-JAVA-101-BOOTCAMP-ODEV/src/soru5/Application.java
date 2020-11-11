package soru5;

public class Application {

	public static void main(String[] args) {
		
		int[] randomArray = new int[100];
		
		
		//diziyi random sayılarla doldurur.
		for(int i=0; i< randomArray.length; i++) {
			randomArray[i]= (int)(Math.random()*100);
		}
	

	}

}
