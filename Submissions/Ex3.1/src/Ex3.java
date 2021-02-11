
public class  Ex3{

	public static void main(String[] args) {// MAIN METHODE 

		char [][] test = createWordSearch (6,5);//I execute the function that creates the array of "char".

		char[][] test2= {
				{'a','b','c','a','b','c','a','d','b'},
				{'e','b','a','b','d','k','h','f','c'},
				{'o','a','c','t','a','b','c','a','v'},
				{'a','c','b','a','c','c','d','i','z'},
				{'h','s','w','k','a','d','b','d','e'},
				{'a','c','b','a','e','r','c','a','u'}};

		boolean reponse =findWord("ab", test2);//I execute the function that looks for a word in the table.

		System.out.println();
		System.out.println();
		System.out.println("**The final answer is "+reponse+"  **");
		System.out.println();
		System.out.println("The word is present "+countWord(test2,"ab")+" Times");

		System.out.println();

		char [][] test_demineur = initGame (4,4,4);//I execute the game.



	}

	public static char [][] createWordSearch(int n,int m){/* METHOD CREATION  MATRIX*/


		char tabCar[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		//I create a table that contains all the letters of the alphabet.

		System.out.println();

		char arr [][] = new char  [n][m];//I create a new table.

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < m; j++) {
				int nombreAleatoire =  (int)(Math.random() * ((25 ) + 1));
				arr[i][j]=  tabCar[nombreAleatoire] ;
				//I assigned to my table random values contained in my previous table.
				System.out.print(arr[i][j]+" , ");


			}
			System.out.println();



		}
		//I return my table.
		return arr;
	}

	static boolean ligne( int i_temp,int j_temp,String str,char tab[][]) {           /* METHOD LIGNE VERIF*/



		int k =str.length();//number of string given to a value .
		int index = 1 ; //Initialize of my index.


		if(k==1){ return true ;}//If i have just one value then its every time true. 

		else {//else i do the verification.
			for (int j = j_temp+1 ;  j < tab[i_temp].length; j++) {

				if ( index<0)
				{	
					return false ;}
				if (tab[i_temp][j]== str.charAt(index)) {

					index++;
				}

				else {	return false;}

				if (index==k)
					return true;

			}
		}





		return false ;
	}
	static boolean ligne_reverse( int i_temp,int j_temp,String str,char tab[][]) {   /* METHOD VERIF REVERSE*/

//the same logic for the reverse lines, the counter will just be reversed.
		int k =str.length();
		int index = 1 ; 


		if(k==1){ return true ;}

		else {
			for (int j = j_temp-1 ;  j > -1; j--) {

				if ( index<0)
				{	
					return false ;}
				if (tab[i_temp][j]== str.charAt(index)) {

					index++;
				}

				else {	return false;}

				if (index==k)
					return true;

			}
		}







		return false ;
	}
	static boolean column(int i_temp,int j_temp,String str , char tab [][]) {        /* METHODE VERIF COLONNE*/
    //The same logic by inverting columns and rows.
		int k =str.length();


		int index = 1; 
		if(k==1){return true ;}

		else {
			for (int i = i_temp +1 ; i <tab.length; i++) {

				if (index==k) { return true;}
				if (tab[i][j_temp] == str.charAt(index)) {
					index++;

				}
				else return false; }

		}


		if (index==k) { return true;}

		return false;
	}
	static boolean column_reverse(int i_temp,int j_temp,String str , char tab [][]) {/* METHODE VERIF C INVERSE*/


		int k =str.length();
		int index = 1 ; 


		if(k==1){ return true ;}

		else {
			for (int i = i_temp-1 ;  i > -1; i--) {

				if ( index<0)
				{	
					return false ;}
				if (tab[i][j_temp]== str.charAt(index)) {

					index++;
				}

				else {	return false;}

				if (index==k)
					return true;

			}
		}





		return false ;
	}
	public static boolean diagonal(String str, char tab [][]) {                      /* METHODE VERIF DIAGONALS*/
		//I call the 4 functions related to the diagonals.
		if((tab.length<1)||str.isEmpty())
			return false;
		char[][] array =tab;
		array=nullArr(array, str);
		char c1;
		for(int i=str.length()-1;i<=array.length-str.length();i++)
		{
			for(int j=str.length()-1;j<=array[0].length-str.length();j++)
			{
				c1=(str.charAt(0));
				if(array[i][j]==c1)
				{
					if(rightDownDiagonal(array, i, j, str)||rightUpDiagonal(array, i, j, str)||leftDownDiagonal(array, i, j, str)||leftUpDiagonal(array, i, j, str))

						return true;
				}
			}
		}

		return false;
	}


	public static char[][] nullArr(char[][] str, String s)/* METHODE IMPORTATION OF MY TAB*/
	{//I am importing my tab to an other place.
		int size=s.length()-1;


		char bigArr[][]=new char[str.length+(2*size)][str[0].length+(2*size)];

		for(int i=0;i<bigArr.length;i++)
		{
			for(int j=0;j<bigArr[0].length;j++)
			{
				bigArr[i][j]='-';
			}
		}
		for(int i=size;i<str.length+size;i++)
		{
			for(int j=size;j<str[0].length+size;j++)
			{
				bigArr[i][j]=str[i-size][j-size];
			}
		}
		return bigArr;
	}

	public static boolean rightDownDiago    (char[][] arrStr, int r, int c ,String str)/* METHOD RIGHT DOWN DIAGONALS*/
	{
		int strCount=1;
		char c1;
		int j=c+1;
		for(int i=r+1;i<str.length()+r;i++)
		{
			c1= str.charAt(strCount);
			if(arrStr[i][j]==c1==false)
			{
				return false;
			}
			j++;
			strCount++;
		}
		return true;
	}
	public static boolean rightDownDiagonal (char[][] arrStr, int r, int c ,String str)
	{
		int strCount=1;
		char c1;
		int j=c+1;
		for(int i=r+1;i<str.length()+r;i++)
		{
			c1= str.charAt(strCount);
			if(arrStr[i][j]==c1==false)
			{
				return false;
			}
			j++;
			strCount++;
		}
		return true;
	}
	public static boolean leftDownDiagonal  (char[][] array, int r, int c ,String str)/* METHOD LEFT DOWN DIAGONALS*/
	{
		int strCount=1;
		char c1;
		int j=c-1;
		for(int i=r+1;i<str.length()+r;i++)
		{
			c1=str.charAt(strCount);
			if(array[i][j]==c1==false)
			{
				return false;
			}
			j--;
			strCount++;
		}
		return true;
	}
	public static boolean rightUpDiagonal   (char[][] arrStr, int r, int c ,String str)/* METHOD RIGHT UP DIAGONALS*/
	{
		int strCount=1;
		char c1;
		int i=r-1;
		for(int j=c+1;j<str.length()+c;j++)
		{
			c1= str.charAt(strCount);
			if(arrStr[i][j]==c1==false)
			{
				return false;
			}
			i--;
			strCount++;
		}
		return true;
	}
	public static boolean leftUpDiagonal    (char[][] arrStr, int r, int c ,String str)/* METHOD LEFT UP DIAGONALS*/
	{
		int strCount=1;
		char c1;
		int i=r-1;
		for(int j=c-1;j>-str.length()+c;j--)
		{
			c1=str.charAt(strCount);
			if(arrStr[i][j]==c1==false)
			{
				return false;
			}
			i--;
			strCount++;
		}
		return true;
	}  



	public static boolean findWord(String str, char tab[][])   {/* METHOD FIND WORD IN MATRIX*/


		int length = tab.length;
		int  col = tab[0].length;

		int counter =0;

		System.out.println();

		System.out.println("String is "+str);



		int index=0;
		boolean rep_fin = true ;
		for (int i = 0; i < length; i++) {



			for (int j = 0; j < col; j++) {


				if (tab[i][j] == str.charAt(index)) {





					boolean rep_ligne =ligne (i,j,str,tab);
					/*AFFICHAGE LIGNE NORMAL*/               

					boolean rep_ligne_inverse =ligne_reverse (i,j,str,tab);
					/*AFFICHAGE LIGNE INVERSE*/ 	        
					boolean rep_col =column (i,j,str,tab);
					/*AFFICHAGE COLONNE NORMAL*/            
					boolean rep_col_inverse =column_reverse (i,j,str,tab);
					/*AFFICHAGE COLONNE INVERSE*/            

					boolean rep_diago = diagonal(str,tab);
					/*AFFICHAGE DIAGO*/            


					if (rep_ligne == true ||rep_ligne_inverse== true ||rep_col== true||rep_col_inverse== true||rep_diago== true) {
						rep_fin = true   ;
						counter++;
					}

					else{rep_fin= false ;} 


				}



				else {continue;}

			}

		}

		if (counter>=1 ) {return true ;

		}
		else return false ;


	}

	public static int countWord(char[][] tab,String str) {/* METHOD FIND HOW MANY TIME A WORD IN MATRIX*/



		int n=0;
		int length = tab.length;
		int  col = tab[0].length;

		int counter =0;


		int index=0;

		for (int i = 0; i < length; i++) {



			for (int j = 0; j < col; j++) {


				if (tab[i][j] == str.charAt(index)) {






					boolean rep_ligne =ligne (i,j,str,tab);
					/*LIGNE NORMAL*/               

					boolean rep_ligne_inverse =ligne_reverse (i,j,str,tab);
					/*LIGNE INVERSE*/ 	         
					boolean rep_col =column (i,j,str,tab);
					/*COLONNE NORMAL*/            
					boolean rep_col_inverse =column_reverse (i,j,str,tab);
					/* COLONNE INVERSE*/            

					boolean rep_diago = diagonal(str,tab);
					/* DIAGO*/            


					if (rep_ligne == true )n++;
					if (rep_ligne_inverse == true )n++;
					if (rep_col == true )n++;
					if (rep_col_inverse== true )n++;
					if (rep_diago== true )counter++;





				}

			}


		}

		n=n+counter/(str.length()+1);
		return n;

	}



	public static char [][] initGame( int height ,int width ,int mines ){

		char bomb ='*';

		char tab_final [][] = new char  [height][width];//I create a new table.
		tab_final=several_bomb(tab_final, mines);//I called my bombs's method to put bomb's in my matrix.

		char arr_sup[][]= new char [height+2][width+2 ];//I created a new tab to avoid getting out of my matrix.
		
		for (int i = 0; i < arr_sup.length; i++) {
		    for (int j = 0; j < arr_sup[0].length; j++) {
		    	arr_sup[i][j]='_';//I fill my tab with empty values.
	
			}
			
		}
		  
		for (int i = 1; i < arr_sup.length-1; i++) {

			for (int j =1; j <arr_sup[0].length-1; j++) {

              arr_sup[i][j]=tab_final[i-1][j-1];//I enter my tab with the bombs in my new tab.

			
			}
		}
		
		for (int k = 1; k < arr_sup.length-1; k++) {
			for (int l = 1; l <arr_sup[0].length-1; l++) {
int conter=0;
if(arr_sup[k][l]!='*') {
	//I check if there is a bomb in all the boxes that surround my value.
	if (arr_sup[k-1][l]=='*')conter++;
	if (arr_sup[k][l-1]=='*')conter++;
	if (arr_sup[k-1][l-1]=='*')conter++;
	if (arr_sup[k+1][l]=='*')conter++;
	if (arr_sup[k][l+1]=='*')conter++;
	if (arr_sup[k+1][l+1]=='*')conter++;
	if (arr_sup[k+1][l-1]=='*')conter++;
	if (arr_sup[k-1][l+1]=='*')conter++;

	
	
			
if(conter==0)
	arr_sup[k][l]='_';
else
arr_sup[k][l]=(char)(conter+'0');

		}}
	
		
		
	}

		for (int i = 1; i < arr_sup.length-1; i++) {

			for (int j =1; j <arr_sup[0].length-1; j++) {

				tab_final[i-1][j-1]=arr_sup[i][j];
			
			}
		}
		for (int i = 0; i < tab_final.length; i++) {
			for (int j = 0; j < tab_final[0].length; j++) {
			System.out.print(tab_final[i][j]+ " ");	
			}System.out.println();
		}
		
		return tab_final;// i returned my value.
	}
	
	public static char [][]one_bomb( char arr[][]){//Created a method to put one bomb in the matrix.

		boolean temp =false;
		
		while (temp==false) {
			int x =  (int)(Math.random() * ((arr.length ) ));
			int y =  (int)(Math.random() * ((arr[0].length) ));
			if(arr[x][y]!='*') {
				arr[x][y]='*';
				temp=true;
			}
		}





		return  arr;


	}

	public static char [][]several_bomb( char arr[][],int mines){//Created a method who repeat the method one_bomb n*.

		for (int i = 0; i < mines; i++) {
			one_bomb(arr);
		}
		return arr;

	}
}









