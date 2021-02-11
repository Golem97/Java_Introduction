
public class Question5{
	
	
	public static void main (String []args) {
		
	int arr[][]= {{2,3,4},{3,5,3},{4,3,6}};
	System.out.println(checkSymmetry(arr));
	}

	
	public static boolean checkSymmetry(int [][] arr) {
		
		int counter=0;
		for (int i = 0; i < arr.length; i++) {


			for (int j = 0; j < arr[i].length; j++) {

             if(arr[i][j]==arr[j][i]) {counter++;}
				System.out.print(arr[i][j]+"  ");


			}


			System.out.println();
			}
		if(counter>7) {return true;}
		else
		return false;
		}
 

			
			
    	
	


    }