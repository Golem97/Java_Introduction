
public class Question6 {
	
	public static void main (String[]args) {
		
		int arr[]= {1,2,3,4,5,6};
		swap(2,3,arr);
	}
	
public static int[] swap(int i, int j, int [] arr) {
	
	int transi=0;
	int transj=0;
	
	transi=arr[i];
	transj=arr[j];
	
	arr[j]=transi;
	arr[i]=transj;

	for (int z = 0; z < arr.length; z++) {
		System.out.print(arr[z]);
		System.out.print(",");
		
	}
	
	
	return arr;
}


}
