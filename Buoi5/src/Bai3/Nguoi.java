package Bai3;

import java.util.Scanner;

public class Nguoi {
	protected String HoTen;
	protected String NgaySinh;
	protected String QueQuan;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\tNhập họ tên: ");
		HoTen = sc.nextLine();
		System.out.print("\tNhập ngày sinh(d/m/y): ");
		NgaySinh = sc.nextLine();
		System.out.print("\tNhập quê quán: ");
		QueQuan = sc.nextLine();
	}
	public void xuat() {
		System.out.format("%-16s %-14s %-12s\n", HoTen, NgaySinh, QueQuan); 
	}
	
	public Nguoi() {
	}
	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		HoTen = hoTen;
		NgaySinh = ngaySinh;
		QueQuan = queQuan;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getQueQuan() {
		return QueQuan;
	}
	public void setQueQuan(String queQuan) {
		QueQuan = queQuan;
	}
	
	
}
