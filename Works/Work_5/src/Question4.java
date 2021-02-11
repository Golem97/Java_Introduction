
public class Question4 {
	
	public static void main(String[] args) {
		int arr[]= {1,6,4,2,1};
		System.out.println(palindrom(arr));
	}
	
		
	
	
	public static boolean palindrom(int [] arr) {

		
		int counter=0;
		int j = arr.length-1;
		
		for (int i = 0; i < (arr.length/2); i++,j--) {
			
		
				if(arr[i]==arr[j]) {
					counter ++;
					
				}
			

}
		
		if(counter == arr.length/2) {
			return true;
			
		}
		return false;
		}
	
	}
