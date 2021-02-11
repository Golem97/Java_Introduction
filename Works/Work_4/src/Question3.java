
public class Question3 {
	public static void main(String[] args) {
		MyConsole consl =new MyConsole();

		int n =0;
		n = consl.readInt("Enter a number ");
		int arr [] = new int  [n];

		for (int i = 0; i < arr.length; i++) {
			int nombreAleatoire = 0 + (int)(Math.random() * ((30 ) + 1));


			arr[i]= nombreAleatoire;
			System.out.print(arr[i]);


			System.out.print(",");
		}



		for (int i = 0; i < arr.length; i++) {
int trans=0 ;
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i]>arr[j]) {
					trans=arr[j];
					arr[j]=arr[i];
					
					arr[i]=trans;
					

				}
				System.out.print(arr[1]);
			}

		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(",");
			}
		


	} 
}

