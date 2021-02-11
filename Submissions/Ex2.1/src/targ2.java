import java.util.Scanner ;



public class targ2 {

	  public static void main (String[]args) {

		Scanner consl=new Scanner(System.in);
		int n_peoples = 2;
		int n_light = 0 ;

		

		
		n_peoples = consl.nextInt();
		n_light   = consl.nextInt ();


		boolean arr [] = new boolean  [n_light];

for (int i = 0; i < arr.length; i++) {
	arr[i]=false;
}
if (!(n_light==0 ||n_peoples==0))
{

		for (int j = 1; j <= n_peoples; j++) {

			for (int j2 = 0; j2 <n_light ; j2++) {
			
				if (j==1) {
					arr[j2] = true ;
				}

				else if ((j2+1)%(j)==0 && arr[j2]==true ) {
					arr[j2]=false ;

				}
				else if ((j2+1)%(j)==0 && arr[j2]==false ) {

					arr[j2]=true ;
				}
				

}
				} 

			}


		


for (int i = 0; i < arr.length; i++) {
	if(arr[i]==true) System.out.print((i+1)+" ,");
}
	}
	


	}
