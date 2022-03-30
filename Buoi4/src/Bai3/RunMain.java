package Bai3;

public class RunMain {

	public static void main(String[] args) {
		Phieu hang = new Phieu();
		hang.nhap();
		System.out.println();
		hang.xuat();
		System.out.println("\t\t\tTong tien = " + hang.Sum());
	}

}
