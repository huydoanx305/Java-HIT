package Bai2;

import java.util.Scanner;

public class SanPham {
	private String MaSP;
	private String TenSP;
	private int SL;
	private double DonGia;
	
	Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("\tNhập mã sản phẩm: ");
		MaSP = sc.nextLine();
		System.out.print("\tNhập tên sản phẩm: ");
		TenSP = sc.nextLine();
		System.out.print("\tNhập số lượng: ");
		SL = sc.nextInt();
		System.out.print("\tNhập đơn giá: ");
		DonGia = sc.nextDouble();
	}
	public void xuat() {
		System.out.format("%-5d %-12s %-14s %-14d %-14.2f %-14.2f\n", Phieu.stt , MaSP, TenSP, SL, DonGia, SL*DonGia);
	}

}
