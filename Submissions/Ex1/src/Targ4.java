
public class Targ4{

	public static void main(String[] args) {
		
		MyConsole consl =new MyConsole(); 

		
        int n4;
		int winner=0;

		n4=consl.readInt("Enter a number : ");

		for (int i=1 ; i<=n4; i++)
		{
		winner = (winner +2)%i ;
		}

		System.out.println(winner+1);
		

	}
	}
