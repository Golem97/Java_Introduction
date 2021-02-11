
public class Question5 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
	reverse(arr);
	}
	
		
	
	
	public static int[] reverse (int arr[]) {
	int transi=0;
	int transj=0;
		int j=arr.length-1;
		for (int i = 0; i < arr.length/2; i++,j--) {
			
			transi=arr[i];
			transj=arr[j];
			
			arr[j]=transi;
			arr[i]=transj;
		
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(",");
			
		}
		
		
		return arr;

}
	
}
