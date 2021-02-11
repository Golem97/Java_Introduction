

public class Question1 {

	public static void main(String[]args) {
		int arr[][]= {{1,2,3,4,5,6},{1,2,3,4,5,6}};
		prArr2(arr);
		
		
	}
	public static void prArr2(int [][]arr) {

		for (int i = 0; i < arr.length; i++) {


			for (int j = 0; j < arr[i].length; j++) {


				System.out.print(arr[i][j]+"  ");


			}


			System.out.println();
			}
		
	}
}
