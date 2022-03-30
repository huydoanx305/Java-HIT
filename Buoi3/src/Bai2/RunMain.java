package Bai2;

public class RunMain {
	
	public static void main(String[] args) {
		Array arr1 = new Array();
		arr1.inputData();
		System.out.print("Mang arr1: ");
		arr1.show();
		System.out.println("\n");
		
		Array arr2 = new Array();
		arr2.inputData();
		System.out.print("Mang arr2: ");
		arr2.show();
		
		System.out.print("\n\n" + "Cac so chan: ");
		arr1.Filter(true);
		arr2.Filter(true);
		System.out.print("\n" + "Cac so le: ");
		arr1.Filter(false);
		arr2.Filter(false);
		System.out.println("\n");
		
		double tbcArr1 = (double)arr1.sum() / arr1.getN();
		double tbcArr2 = (double)arr2.sum() / arr2.getN();
		if(tbcArr1 > tbcArr2)
			System.out.println("arr1 > arr2");
		else if(tbcArr1 < tbcArr2)
			System.out.println("arr1 < arr2");
		else
			System.out.println("Bye");
	}
}