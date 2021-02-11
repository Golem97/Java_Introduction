
public class Question7{



	public static void main(String[] args) {
		int[]arr = {-11,-2,3,-4,-5,7,-8,9} ;
		System.out.println(mostPositive(arr));

	}


	public static boolean mostPositive(int[]arr) {

		int counterp=0;
		int countern=0;



		for (int i = 0; i < arr.length; i++) {


			if(arr[i]>0) {
				counterp++;

			}
			else {
				countern++;
			}

		}
		
		System.out.println(countern+" "+counterp);

		if(counterp > countern ) {
			return true;
		}
		else
			return false;





	}
}
