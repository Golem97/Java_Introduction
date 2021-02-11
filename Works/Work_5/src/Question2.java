
public class Question2 {

	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println(arrayMean(arr));
	}
		
	
	
	public static double arrayMean(int [] arr) {
		double moyenne=0;
		
	for (int i = 0; i < arr.length; i++) {
			
			moyenne=moyenne+arr[i];		
			
		}
	
	moyenne= moyenne/arr.length;
		
		
		return moyenne;
	}

}
