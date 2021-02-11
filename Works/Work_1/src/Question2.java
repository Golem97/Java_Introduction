public class Question2{


	public static void main (String[]args) {
		MyConsole consl =new MyConsole();

		int x,y,z,w,trans,trans2;

		w=consl.readInt("Enter a number : ");
		x=consl.readInt("Enter a number : ");
		y=consl.readInt("Enter a number : ");
		z=consl.readInt("Enter a number : ");
		
		 System.out.println("w = "+w); 
		 System.out.println("x = "+x);
		 System.out.println("y = "+y);
		 System.out.println("z = "+z);
		 
		 
     	 trans=x;
     	 trans2=w;
		 x=y;
		 w=trans;
	
		 trans=y;
		 y=z;
		 x=trans;
		 z=trans2;
			 
		 
		 
		 System.out.println("  "); 
		 System.out.println("w = "+w); 
		 System.out.println("x = "+x);
		 System.out.println("y = "+y);
		 System.out.println("z = "+z);


	}
}
