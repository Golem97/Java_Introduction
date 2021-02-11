
public class Question6{



	public static void main(String[] args) {
		int[][]arr = {{1,2,3,4,5,7,8,9},{1,2,3,4,6,7,8,9} };
		System.out.println(isSortedDouble(arr));

	}


	public static boolean isSortedDouble(int [][]arr) {

		int counter=0;
	
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length-1; j++) {
				 
				if(arr[i][j]<=arr[i][j+1]) {
					counter++;
					
				}
				
			}
			
			
			
		}
		counter=counter+ arr.length;
	
		if(counter==arr[0].length*arr.length ) {
		return true;
		}
		else return false;
		
		
	
		
		
	}
}
