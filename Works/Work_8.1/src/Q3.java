
public class Q3 {

	public static void main(String[] args) {
	      	printLine(6);
	}
	
	
	
	
	public static void printLine(int num) {
		
		if (num==0) {
		return;
		}
		System.out.print(" * ");
         printLine(num-1);
					
	}
}
    