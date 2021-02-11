import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner ;



public class targ4 {

	public static void main(String[] args) {

		int num_0f_function  = Integer.parseInt(args[0]);

		if(num_0f_function==1 ||num_0f_function==2 ||num_0f_function==3 ||num_0f_function==4)
		{
			if (num_0f_function == 1)
			{
				ex1();
			}
			if ( num_0f_function ==2) 
			{
				ex2();
			}
			if ( num_0f_function ==3) {
				ex3();
			}
			if ( num_0f_function ==4) {
ex4();
			}
		}
		else 
			System.out.println("WRONG NUMBER");

	}

	public static void ex1()
	{

		MyConsole consl =new MyConsole();


		int n, m ;


		n = consl.readInt("Enter matrices width size:");
		m = consl.readInt("Enter matrices length size:");

		int m1 [][] = new int  [n][m];
		int m2 [][] = new int  [n][m];
		int m3 [][] = new int  [n][m];





		System.out.println(); System.out.println("Matrice A");  System.out.println();

		for (int i = 0; i < m1.length; i++) {


			for (int j = 0; j < m1[i].length; j++) {
				int nombreAleatoire = 10 + (int)(Math.random() * ((100 - 10) + 1));
				m1[i][j]= nombreAleatoire ;
				System.out.print(m1[i][j]+"  ");

			}
			System.out.println();


		} 
		System.out.println();   System.out.println("Matrice B"); System.out.println();


		for (int k = 0; k < m2.length; k++) {


			for (int l = 0; l < m2[k].length; l++) {
				int nombreAleatoires = 10 + (int)(Math.random() * ((50 - 0) + 1));
				m2[k][l]= nombreAleatoires ;
				System.out.print(m2[k][l]+"  ");

			}
			System.out.println();


		} 

		System.out.println(); System.out.println("Matrice C = A + B "); System.out.println();
		for (int s = 0; s < m3.length; s++) {


			for (int p = 0; p < m3[s].length; p++) {

				m3[s][p]= m1[s][p]+ m2[s][p] ;
				System.out.print(m3[s][p]+"  ");

			}
			System.out.println();


		} 
	}

	public static void ex2()
	{


		int n_peoples = 2;
		int n_light = 0 ;

		n_peoples = MyConsole.readInt("Enter number of People");
		n_light   = MyConsole.readInt("Enter number of light");


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

	public static void ex3()
	{


		//Importation of the reader My console//

		MyConsole consl =new MyConsole();

		//Variable Declaration//

		int size , queen  ;
		int sum_l =0 ;
		int sum_c =0 ;
		int val = 0 ;
		// Asks the user for the variables //

		size = consl.readInt("Enter the matrix size:");
		queen = consl.readInt("Enter number of queens:");

		// Creating the table//

		int arr [][] = new int  [size][size];


		// Initializing the table//
		System.out.println(); System.out.println("Given Matrix");  System.out.println();

		//Entered Queen //
		for (int counter = 0; counter < queen; counter++) {


			//Place the queens randomly//

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j]= 0;

				}
			}



			for (int i = 1; i < queen+1; i++) {
				int  rand_n =  0 + (int)(Math.random() * (((size)  -   0) ));
				int  rand_m =  0 + (int)(Math.random() * (((size)  -   0) ));


				if(arr[rand_n][rand_m]==1)
				{  i--;}
				else 
					arr[rand_n][rand_m]= 1;
			}





		}
		//Display the final matrix//

		for (int i = 0; i < arr.length; i++) {


			for (int j = 0; j < arr[i].length; j++) {


				System.out.print(arr[i][j]+"  ");


			}


			System.out.println(); }
		System.out.println();


		for (int r = 0; r < arr.length; r++) {

			sum_l=0 ;
			sum_c=0 ;

			for (int s = 0; s < arr[r].length; s++) {

				sum_l = arr[s][r] + sum_l ;
				sum_c = arr[r][s] + sum_c ;

				if (sum_c >= 2 || sum_l >= 2) {val = 1 ;}


			} 

			System.out.println();

		}



		ArrayList<String> find_my_diago = new ArrayList<String>();
		ArrayList<String> temp_n = new ArrayList<String>();

		int temp_row = arr.length;
		int temp_col = arr[0].length;
		int temp_diag = temp_row+temp_col-1;
		int min=1 - temp_row;

		for (int i = 0; i<temp_diag; i++) {
			find_my_diago.add("");
			temp_n.add("");
		}

		for (int j = 0; j<temp_row; j++) {
			for (int i = 0; i<temp_col; i++) {
				find_my_diago.set(i+j, find_my_diago.get(i+j) +(Integer.toString(arr[j][i])));
				temp_n.set(-min+i-j, temp_n.get(-min+i-j)
						+(Integer.toString(arr[j][i])));
			}
		}

		
		int return_value=0;
		find_my_diago.addAll(temp_n);
		int diag_sum=0;
		String [] diago = find_my_diago.toArray(new String[0]);
		for (int j = 0; j < diago.length; j++) 
		{
			diag_sum=Integer.parseInt(diago[j]);
			int return_conter=0;
			while(diag_sum>0)
			{
				return_conter=return_conter+diag_sum%10;
				diag_sum=diag_sum/10;
			}

			if (return_conter>1)
				return_value=1;
		}

		
		

		if (val==0) {
			if(return_value==0)
			System.out.println("Is There a threat? NO");
			if(return_value==1)
				System.out.println("Is There a threat? YES");
				
			}
		if (val==1) {
			if(return_value==0)
			System.out.println("Is There a threat? YES");
			if(return_value==1)
			System.out.println("Is There a threat? YES");
			
		}

	} 


public static void ex4() {
	
	int [][] arr1=new int [10][10];
	Random random=new Random();
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr1[i].length; j++) {
			arr1[i][j]=random.nextInt(20) +1;
		}
	}

	System.out.println("Matrix 10 /10: ");
System.out.println();


	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr1[i].length; j++) {
			System.out.print(arr1[i][j]+" ,");
		}System.out.println();
	}
	
	System.out.println();
	
	int [][] arr2=new int [2][3];//create a new matrix 2 /3 
	
	
for (int i = 0; i < arr2.length; i++) {
	for (int j = 0; j < arr2[i].length; j++) {
		arr2[i][j]=MyConsole.readInt("Enter  number in the matrix: "  );
	}
}
System.out.println();
//print the matrix b 

for (int i = 0; i < arr2.length; i++) {
	for (int j = 0; j < arr2[i].length; j++) {
		System.out.print(arr2[i][j]+ " , ");
	}	System.out.println();
}
	boolean solution=false;
	int cont_solution=0;

	for (int i = 0; i < (arr1.length-arr2.length+1); i++) {
		for (int j = 0; j < (arr1[0].length-arr2[0].length+1); j++) {
			
			
			if (arr1[i][j]==arr2[0][0])
			{
				for (int i2 = 0; i2 < arr2.length; i2++) {
					for (int j2 = 0; j2 < arr2[i2].length; j2++) {
						if(arr1[i+i2][j+j2]==arr2[i2][j2])
						{
							cont_solution++;
							if(cont_solution==6)
								solution=true;
							
						}
						else 
							cont_solution=0;
							
					}
				}
			}
		}
	}
	if(solution==false)
System.out.println("The random matrix doesn'tcontains the users matrix");
	if (solution==true)
System.out.println("The random matrix contains the users matrix");
	
}
	
	

	 	}