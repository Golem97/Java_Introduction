import java.util.Random;

public class Question1 {

	public static void main(String[] args) {
		MyConsole consl =new MyConsole();
		
		int n =0;
		
		n = consl.readInt("Enter a number ");
		
		
		int arr [] = new int  [n];
		
		
		for (int i = 0; i < arr.length; i++) {
			int nombreAleatoire = 0 + (int)(Math.random() * ((n - 0) + 1));

		
				arr[i]= nombreAleatoire;
			System.out.print(arr[i]);
				
			
			System.out.print(",");
		}
		int counter=0 ;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==0) {
				counter++;
				
			}
			System.out.print(counter);
		}
		
	}
	
	
}
