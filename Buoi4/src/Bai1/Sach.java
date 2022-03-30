package Bai1;

import java.util.Scanner;

public class Sach {
	private String MaSach;
	private String TenSach;
	private String Nxb;
	private int SoTrang;
	private float GiaTien;

	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.print("\tNhap ma sach: ");
		MaSach = sc.nextLine();
		System.out.print("\tNhap ten sach: ");
		TenSach = sc.nextLine();
		System.out.print("\tNhap nxb: ");
		Nxb = sc.nextLine();
		System.out.print("\tNhap so trang: ");
		SoTrang = sc.nextInt();
		System.out.print("\tNhap gia tien: ");
		GiaTien = sc.nextFloat();
		System.out.println();
	}
	
	public void output() {
		 System.out.printf("%-5s%-18s%-18s%-14s%-12s%s\n",RunMain.stt, MaSach, TenSach, Nxb, SoTrang, GiaTien);
	} 
	
}

