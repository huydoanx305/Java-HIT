package Bai2;

import java.util.Scanner;

public class NhanSu {
	private String MaNhanSu;
	private String HoTen;
	private Date ns;
	
	Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.print("Nhap ma nhan su: ");
		MaNhanSu = sc.nextLine();
		System.out.print("Nhap ho ten: ");
		HoTen = sc.nextLine();
		ns = new Date();
		ns.nhap();
	}
	public void xuat() {
		System.out.println("Ma nhan su: " + MaNhanSu);
		System.out.println("Ho ten: " + HoTen);
		ns.xuat();
	}
}
