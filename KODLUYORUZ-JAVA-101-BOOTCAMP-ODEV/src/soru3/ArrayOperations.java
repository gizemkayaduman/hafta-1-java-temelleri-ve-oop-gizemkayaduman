package soru3;

public class ArrayOperations {
	
	//diziyi rastgele sayılarla doldurur.
	public static int[] fill(int[] array){
		for(int i=0; i< array.length; i++) {
			array[i]= (int)(Math.random()*100);
		}
		return array;
	}
	
	//diziyi ekrana yazdırır. Bu kodu kontrol amaçlı yazdım.
	public static int[] print(int[] array) {

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		return array;
	}
	
	//dizinin elemanlarının ortalamasını alır.
	public static double sum(int[] array) {
		double total=0;

		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return (total/array.length);
    }
	
}
