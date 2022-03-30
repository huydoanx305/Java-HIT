package Bai1;

import java.util.Scanner;

public class Bai1 {
	
	public static int searchMax(int a, int b, int c)
	{
		return Math.max(a,Math.max(b, c));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a = ");
		int a = sc.nextInt();
		System.out.print("Nhap b = ");
		int b = sc.nextInt();
		System.out.print("Nhap c = ");
		int c = sc.nextInt();
		
		System.out.println("Max = " + searchMax(a, b, c));
	}
}
