package Bai3;

import java.util.Scanner;

public class Hang {
	private String MaHang;
	private String TenHang;
	private float DonGia;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhap ma hang: ");
		MaHang = sc.nextLine();
		System.out.print("\tNhap ten hang: ");
		TenHang = sc.nextLine();
		System.out.print("\tNhap don gia: ");
		DonGia = sc.nextFloat();
	}
	public void xuat() {
		System.out.printf("%-5s%-18s%-18s%s\n", Phieu.stt , MaHang, TenHang, DonGia);
	}
	
	public float getDonGia() {
		return DonGia;
	}
	public void setDonGia(float donGia) {
		DonGia = donGia;
	}
	
}
