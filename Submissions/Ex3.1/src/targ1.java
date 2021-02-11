import java.util.Scanner ;
import java.util.Random ;


public class targ1{

	public static void main(String[] args) {

		MyConsole consl =new MyConsole();

		int n =0 ;

		int alea[][] = new int  [10][10] ;





		System.out.println();


		System.out.println("Matrice Aléatoir");System.out.println();

		for (int i = 0; i < alea.length; i++) {
			for (int j = 0; j < alea.length; j++) {
				int nombreAleatoire = 10 + (int)(Math.random() * ((100 - 10) + 1));
				alea[i][j] = nombreAleatoire ;

				System.out.print(alea[i][j] + " , ");

			}

			System.out.println();


		}
		System.out.println();
		int arr_ask[][]= new int [2][3];// New tab 2/3 //

		for (int i = 0; i < arr_ask.length; i++) {
			for (int j = 0; j < arr_ask[i].length; j++) {

				arr_ask[i][j]= MyConsole.readInt("Enter a number") ;



			}
			System.out.println();

		} 
		for (int j = 0; j < arr_ask.length; j++) {
			for (int j2 = 0; j2 < arr_ask[j].length; j2++) {

				System.out.print(arr_ask[j][j2]+" , ");

			}

			System.out.println();

		}

	}

}

	
