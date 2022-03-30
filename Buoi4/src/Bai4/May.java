package Bai4;

import java.util.Scanner;

public class May {
	private String MaMay;
	private String KieuMay;
	private String TinhTrang;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhap ma may: ");
		MaMay = sc.nextLine();
		System.out.print("\tNhap kieu may: ");
		KieuMay = sc.nextLine();
		System.out.print("\tNhap tinh trang: ");
		TinhTrang = sc.nextLine();
	}
	public void xuat() {
		System.out.printf("%-5s%-12s%-12s%s\n", PhongMay.stt , MaMay, KieuMay, TinhTrang);
	}
}
