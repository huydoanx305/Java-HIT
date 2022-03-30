package Bai2;

import java.util.Scanner;

public class Date {
	 private int D;
	 private int M;
	 private int Y;
	
	 Scanner sc = new Scanner(System.in);
	 public void nhap() {
		 System.out.print("Nhap ngay: ");
		 D = sc.nextInt();
		 System.out.print("Nhap thang: ");
		 M = sc.nextInt();
		 System.out.print("Nhap nam: ");
		 Y = sc.nextInt();
	 }
	 public void xuat() {
		 System.out.println("Ngay " + D + " Thang " + M + " Nam " + Y + "");
	 }

}
