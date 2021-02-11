
public class Question7 {

	public static void main (String[]args) {
		int arr[]= {1,2,3,4,5,6};
		evenOddSort(arr);
		
	}
	public static void evenOddSort(int [] arr) {
		int transi=0;
		int transj=0;
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[j]%2!=0) {
						transi=arr[i];
						transj=arr[j];
						
						arr[j]=transi;
						arr[i]=transj;
					}
				}
			}
		}
			
		for (int z = 0; z < arr.length; z++) {
			System.out.print(arr[z]);
			System.out.print(",");
			
		}
		
		
	
	}
}