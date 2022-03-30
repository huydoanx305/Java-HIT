package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
	private String MaPhieu;
	private String TenPhieu;
	private DateTime a;
	private ArrayList<SanPham> list;
	private int n;
	static int stt = 1;
	
	Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("Nhập mã phiếu: ");
		MaPhieu = sc.nextLine();
		System.out.print("Nhập tên phiếu: ");
		TenPhieu = sc.nextLine();
		a = new DateTime();
		a.nhap();
		
		System.out.print("Nhập n = ");
		n = sc.nextInt();
		list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			SanPham SP = new SanPham();
			System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1));
			SP.nhap();
			list.add(SP);
		}
	}
	public void xuat() {
		System.out.println();
		System.out.println("Mã Phiếu: "+ MaPhieu);
		System.out.println("Tên Phiếu: "+ TenPhieu);
		a.xuat();
		System.out.format("%-5s %-12s %-14s %-14s %-14s %-14s \n", "STT" , "Mã SP", "Tên SP", "Số Lượng", "Đơn Giá", "Thành Tiền");
		for(int i = 0; i < n; i++) {
	    	 list.get(i).xuat();
	    	 stt++;
	     }
			
	}
	
}
