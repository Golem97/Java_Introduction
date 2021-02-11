
public class Question8{



	public static void main(String[] args) {
		int[]arr = {10,2,13,4,5,7,8,16} ;
		System.out.println(Biggest2(arr));

	}


	public static int Biggest2(int[]arr) {


int trans=0;
int trans2=0;
		for (int i = 0; i < arr.length; i++) {
trans=arr[0];
         if(arr[i]>trans) {
        	 trans=arr[i];
        	 arr[i]=0;
        	 System.out.println(arr[i]);
         }
for (int j = 0; j < arr.length; j++) {
	trans2=arr[0];
	
	
	if(arr[j]>trans2) {
   	 trans2=arr[j];
	
}
		}
	


	}
		return trans2;
}}
