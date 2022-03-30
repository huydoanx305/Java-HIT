package Bai4;

import java.util.Scanner;

import Bai3.Hang;

public class PhongMay {
	private String MaPhong;
	private String TenPhong;
	private float DienTich;
	private QuanLy x;
	private May[] y;
	private int n;
	static int stt = 0;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma phong: ");
		MaPhong = sc.nextLine();
		System.out.print("Nhap ten phong: ");
		TenPhong = sc.nextLine();
		System.out.print("Nhap dien tich (m2): ");
		DienTich = sc.nextFloat();
		
		x = new QuanLy();
		x.nhap();
		
		System.out.print("Nhap so may: ");
		n = sc.nextInt();
		y = new May[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap may thu "+ (i + 1) +": ");
			y[i] = new May();
			y[i].nhap();
		}
	}
	
	public void xuat() {
		System.out.println("Ma phong: " + MaPhong);
		System.out.println("Ten phong: " + TenPhong);
		System.out.println("Dien tich: " + DienTich + "m2");
		x.xuat();
		
		System.out.printf("%-5s%-12s%-12s%s\n","STT", "Ma may", "Kieu may", "Tinh trang");
		for(int i = 0; i < n; i++) {
			stt++;
			y[i].xuat();
		}
	}

}


