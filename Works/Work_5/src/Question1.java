
public class Question1 {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5};
		System.out.println(arraySum(arr));
	}

	
	public static double arraySum(int[]arr){
	
		double sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum=sum+arr[i];		
			
		}
		
		return sum;}
	

}

