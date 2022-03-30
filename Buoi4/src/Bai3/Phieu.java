package Bai3;

import java.util.Scanner;

public class Phieu {
	private String MaPhieu;
	private Hang[] x;
	private int n;
	static int stt = 0;
	Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("Nhap ma phieu: ");
		MaPhieu = sc.nextLine();
		
		System.out.print("Nhap so hang: ");
		n = sc.nextInt();
		sc.nextLine();
		x = new Hang[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap hang thu "+ (i + 1) +": ");
			x[i] = new Hang();
			x[i].nhap();
		}
	}
	
	public void xuat() {
		System.out.println("Ma phieu: " + MaPhieu);
		System.out.printf("%-5s%-18s%-18s%s\n","STT", "Ma hang", "Ten hang", "Don gia");
		for(int i = 0; i < n; i++) {
			stt++;
			x[i].xuat();
		}
	}
	
	public float Sum() {
		float s = 0;
		for(int i = 0; i < n; i++) {
			s += x[i].getDonGia();
		}
		return s;
	}

}



