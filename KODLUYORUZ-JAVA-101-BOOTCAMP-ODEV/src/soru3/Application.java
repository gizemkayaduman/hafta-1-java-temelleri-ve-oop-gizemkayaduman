package soru3;

public class Application {
	
	public static void main(String[] args) {
		
		int[] randomArray = new int[10];
		
		ArrayOperations.fill(randomArray);
		
		//ArrayOperations.print(randomArray);
		
		System.out.println(ArrayOperations.sum(randomArray));
		
		
		
		
	}

}
