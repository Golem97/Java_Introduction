
public class Question4 {

	public static void main(String[] args) {
		
		int []arr = {1,3,3,3,4,4};
		System.out.println(compressedArray(arr));

	}

	public static int compressedArray(int []arr ) {
		
		int counter =1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
			counter--;	
			}
			
			counter++;
		}
	
		int [][]arr2 = new int [2][counter];
	
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				arr2[0][j]=arr[j];
			
				System.out.print( arr2[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
		
		return counter;
			
		}
	
	
		
		
	}
