public class Question8{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int x;
		int y;
		int div;
		int rest;
		int min;
	
		
//recieve the two variable
		x=consl.readInt("Enter a number  : ");
		y=consl.readInt("Enter a number  : ");

		if (x>y) {
			min=y;
			
		}
		else {
			min=x;
		}


div = x/y;

System.out.println(div);

		rest = x-(div*min);
		System.out.println("le reste est "+rest);

	}
}

