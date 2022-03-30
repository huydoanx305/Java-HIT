package Bai2;

import java.util.Scanner;

public class DateTime {
	private int date;
	private int month;
	private int year;
	
	Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		System.out.print("Nhập ngày: ");
		date = sc.nextInt();
		System.out.print("Nhập tháng: ");
		month = sc.nextInt();
		System.out.print("Nhập năm: ");
		year = sc.nextInt();
	}
	public void xuat() {
		System.out.println("Ngày " + date + " Tháng " + month + " Năm " + year + "");
	}

}
