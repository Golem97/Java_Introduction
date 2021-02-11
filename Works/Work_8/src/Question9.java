
public class Question9{



	public static void main(String[] args) {
		int[][]arr = {{1,2,3,4,6,7,8,9},{1,2,3,4,6,7,8,9} };
		System.out.println(isSortedDouble(arr));

	}


	public static boolean isSortedDouble(int [][]arr) {

		int counter=0;
		int counter2=0;
		
		
		
		for (int i = 0; i < arr.length; i++, counter=0) {
			for (int j = 0; j < arr[0].length-1; j++) {
				 
				if(arr[i][j]<=arr[i+1][j+1]) {
					counter++;
					
				}
				else {counter=0;}
			
				if(counter==arr.length) {counter2++;}
		
				
				if(i==arr[0].length-1) {
					counter=0;
				}
			}                                          

		}
		
		if(arr.length==counter2) {
		return true;
	}

	
	
	
	
	else {return false;}
		
		
	
		
		
	}
}
