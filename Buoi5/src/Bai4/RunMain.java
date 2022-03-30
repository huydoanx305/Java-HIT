package Bai4;

public class RunMain {
	public static void main(String[] args) {
		
		Sum <Integer> X = new Sum<Integer>(3, 6);
		System.out.println("Sum Integer: " + ( X.getSoB() + X.getSoA() ));
		
		Sum <Long> Y = new Sum<Long>(36l, 69l);
		System.out.println("Sum Long: "+ ( Y.getSoA() + Y.getSoB() ));
		
		Sum <Float> Z = new Sum<Float>(6.3f, 3.9f);
		System.out.println("Sum Float: "+ ( Z.getSoB() + Z.getSoA() ));
		
		Sum <Double> T = new Sum<Double>(3.6333, 9.3666);
		System.out.println("Sum Double: " + ( T.getSoA() + T.getSoB() ));
	}

}
