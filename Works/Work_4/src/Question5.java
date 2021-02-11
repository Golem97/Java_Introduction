import java.util.Random;
public class Question5 {
	
	public static void main(String[] args) {
		MyConsole consl =new MyConsole();
		
		int n =0;
		
		n = consl.readInt("Enter a number ");
		
		
		int arr [] = new int  [n];
		
		
		for (int i = 0; i < arr.length; i++) {
			int nombreAleatoire = 0 + (int)(Math.random() * ((2 - 0) + 1));

		
				arr[i]= nombreAleatoire;
			System.out.print(arr[i]);
				
			
			System.out.print(",");
		}
		
		
		int counter=0;
		int j = arr.length-1;
		
		for (int i = 0; i < (arr.length/2); i++,j--) {
			
		
				if(arr[i]==arr[j]) {
					counter ++;
					
				}
			
				
		
			
		}
		System.out.println();
		System.out.println( counter);
	}
	

}
