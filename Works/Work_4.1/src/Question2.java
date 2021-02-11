public class Question2 {

	public static void main(String[] args) {
		MyConsole consl =new MyConsole();

		int n =0;
		int max=0;
		int min=0;

		n = consl.readInt("Enter a number ");


		int arr [] = new int  [n];


		for (int i = 0; i < arr.length; i++) {

			int rand = 10 + (int)(Math.random() * ((30 - 10) + 1));

			arr[i]= rand;
			System.out.print(arr[i]);

			System.out.print(",");
		}
		for (int i = 0; i < arr.length; i++) {
			max=arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]>arr[i]) {
					max=arr[j];
					
				}
				for (int j2 = 0; j2 < arr.length; j2++) {
					if (arr[j2]>max) {
						max=arr[j2];
				}
				
			}
		
		}
	
		}
		for (int i = 0; i < arr.length; i++) {
			min=arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]<arr[i]) {
					min=arr[j];
					
				}
				for (int j2 = 0; j2 < arr.length; j2++) {
					if (arr[j2]>min) {
						min=arr[j2];
				}
				
			}
		
		}
	
		}System.out.println();
	        System.out.println();
	        
		System.out.println("The maximum is :"+max);
		System.out.println("The minimum is :"+min);
		
	}}
	
	



