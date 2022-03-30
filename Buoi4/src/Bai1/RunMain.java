package Bai1;

import java.util.Scanner;

public class RunMain {
	static int stt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so sach: ");
		int n = sc.nextInt();
		
		Sach[] book = new Sach[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Nhap sach thu "+(i + 1)+": ");
			book[i] = new Sach();
			book[i].input();
		}
		System.out.printf("%-5s%-18s%-18s%-14s%-12s%s\n","STT", "Ma sach","Ten sach","NXB","So trang","Gia tien");
		for(int i = 0; i < n; i++)
		{
			stt++;
			book[i].output();
		}
	}

}
