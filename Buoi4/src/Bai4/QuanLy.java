package Bai4;

import java.util.Scanner;

public class QuanLy {
	private String MaQL;
	private String HoTen;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma quan ly: ");
		MaQL = sc.nextLine();
		System.out.print("Nhap ho ten quan ly: ");
		HoTen = sc.nextLine();
	}
	public void xuat() {
		System.out.println("Ma quan ly: " + MaQL);
		System.out.println("Ten quan ly: " + HoTen);
	}
}
