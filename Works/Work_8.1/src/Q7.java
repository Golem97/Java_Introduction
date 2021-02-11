
public class Q7 {

	
	
	public static void main(String[] args) {
		
		System.out.println(reverseNumber(12345));
		
		
	}
	
	public static int reverseNumber(int nombre) {
		
		
		
		int resultat = 0;
		int temp = 0;
		 
		while(nombre > 0)
		{
		 
		 
		temp = nombre%10;
		 
		resultat = resultat * 10 + temp;
		nombre = nombre/10;

		
		
		
	}
		return resultat;
	
	

}
}