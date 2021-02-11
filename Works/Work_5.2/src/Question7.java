
public class Question7{
	
	
	public static void main (String []args) {
		
	int arr[][]= {{2,0,4},{0,5,0},{4,3,6}};
	System.out.println( numZeros(arr));
	}

	
	public static int numZeros(int [][] arr) {
		
		int counter=0;
		for (int i = 0; i < arr.length; i++) {


			for (int j = 0; j < arr[i].length; j++) {

             if(arr[i][j]==0) {counter++;}
				System.out.print(arr[i][j]+"  ");


			}


			System.out.println();
			}
		return counter;
		}
 

			
			
    	
	


    }