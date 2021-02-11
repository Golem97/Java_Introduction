
public class Question1 {

	
	
public static void main(String[] args) {
	int []arr = {1,2,5,5,6,7,8,9};
		System.out.println(isSorted(arr));
		
	}


public static boolean isSorted(int []arr) {
	int counter =0;
	for (int i = 0; i < arr.length-1; i++) {
		if (arr[i]<=arr[i+1]) {
			counter++;
			
		}
	}
	if(counter+1==arr.length) {
		return true;
	}
	else
	return false;
}
}
 