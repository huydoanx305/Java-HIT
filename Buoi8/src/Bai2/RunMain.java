package Bai2;

public class RunMain {
	public static void main(String[] args) {
		IShape[] S = new IShape[3];
		S[0] = new Rectangle(3.4,5.3);
		S[1] = new Circle(5.5);
		S[2] = new Rectangle(7.3,4.3);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Area of shapes["+ i +"]: " + S[i].getArea());
			System.out.println("Perimeter of shapes["+ i +"]: " + S[i].getPerimeter());
		}
	}
}
