import java.io.ObjectInputStream.GetField;

public class Targuil10 {
	
	
	public static void main(String[] args) {
		Point p1 = new Point(3, 2);
		Point p2 = new Point(6, 3);
		
		Point p3 = new Point(3, 2);
		Point p4 = new Point(3, 3);
		
		
		Interval2 i2 = new Interval2(p1, p2);
		Interval2 i3 = new Interval2(p3, p4);
		
	
    System.out.println(i2.intrLength());
    System.out.println();
    System.out.println(i2.toString());
    System.out.println();
    System.out.println(i2.midPoint());
    System.out.println();
    System.out.println(i2.compareLength(i3));
    System.out.println();
	System.out.println(i2.equals(i3));
	
	
		
	}


}
 