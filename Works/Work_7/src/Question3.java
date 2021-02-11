
public class Question3 {

	public static void main(String[] args) {
		
		
		printLine(5);

	}

	public static char printLine(int num) {
		
			if(num==0) {
				
				
				return ' ';
			}
	
			System.out.print("*");
		
		
		return printLine(num-1);
			
		}
		
		
	}
