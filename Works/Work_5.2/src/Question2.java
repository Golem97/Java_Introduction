public class Question2 {
	
	public static void main (String []args) {
		
	int arr[][]= {{1,2,3,4,5,6},{1,2,3,4,5,6}};
	System.out.println(sumArr2(arr));
	}

	public static int sumArr2(int [][]arr2) {
		
		int sum = 0;
		
		
		for (int i = 0; i < arr2.length; i++) {


			for (int j = 0; j < arr2[i].length; j++) {

sum=sum+arr2[i][j];
				System.out.print(arr2[i][j]+"  ");


			}


			System.out.println();
			}
		
		return sum;
	}
	
	
	
}
