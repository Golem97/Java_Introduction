
public class Rectangle {

	private   double w ; 
	private   double h ;



	public Rectangle (double w, double h ) {
		this.w = w;
		this.h = h;	
	}

	public Rectangle(Rectangle rec){
		this.w=rec.getWeight();
		this.h=rec.getHigh();

	}

	public double getWeight() {
		return w;
	}

	public double getHigh() {
		return h ;

	}

	public void SetWeight(double w) {
		this.w=w;
	}


	public void SetHigh(double h) {
		this.h=h;
	}
	public double perimeter() {
		return (this.w+this.h);
	}
	public double area() {
		return (this.w*this.h);
	}
	public String toString() {
		String s = "RECTANGLE   : H = "+this.h+"    W = "+this.w;
		return s;
	}
	public int compare(Rectangle r){
		if (this.h==r.getHigh()&&this.w==r.w) {
			return 0;

		}
		else return 1;

	}
	public boolean contains(Point p) {
		
		if (p.getAbscisse()<this.h && p.getOrdonne()<this.w) {
			return true;
		}
		else return false;
	}
	


}