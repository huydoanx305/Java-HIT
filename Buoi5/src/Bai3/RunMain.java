package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
	
	public static void checkK15(ArrayList<SinhVien> list, int KH) {
		int count = 0;
		for(int i=0; i<list.size(); i++)
			if(list.get(i).getKhoaHoc() == 15)
				count++;
		System.out.println("Lớp học có " + count + " sinh viên khóa " + KH + "");
	}
	
	public static void sapXep(ArrayList<SinhVien> list) {
//		LopHoc.stt = 1;
//		for(int i = 0; i < list.size(); i++)
//	        for(int j = i + 1; j < list.size(); j++)
//	            if(list.get(i).getKhoaHoc() > list.get(j).getKhoaHoc())
//	                Collections.swap(list, i, j);
//		
//		Sắp xếp theo tên
		for(int i = 0; i < list.size(); i++)
	        for(int j = i + 1; j < list.size(); j++)
	            if(list.get(i).getHoTen().compareToIgnoreCase(list.get(j).getHoTen()) > 0)
	                Collections.swap(list, i, j);
	        	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LopHoc LH = new LopHoc();
		
		String MaLH;
		String TenLH;
		String NgayMo;
		String GiaoVien;
		int n;
		ArrayList<SinhVien> list;
		/* Nhập lớp học*/
		System.out.print("Nhập mã lớp học: ");
		MaLH =  sc.nextLine();
		LH.setMaLH(MaLH);
		
		System.out.print("Nhập tên lớp học: ");
		TenLH = sc.nextLine();
		LH.setTenLH(TenLH);
		
		System.out.print("Nhập ngày mở (d/m/y): ");
		NgayMo = sc.nextLine();
		LH.setNgayMo(NgayMo);
		
		System.out.print("Nhập tên giáo viên: ");
		GiaoVien = sc.nextLine();
		LH.setGiaoVien(GiaoVien);
		
		/* Nhập sinh viên */
		System.out.print("Nhập số sinh viên: ");
		n = sc.nextInt();
		LH.setN(n);
		
		sc.nextLine();
		
		String MaSV;
		String Nganh;
		int KhoaHoc;
		list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			SinhVien SV = new SinhVien();
			System.out.println("Nhập sinh viên thứ " + (i + 1) + ":");
			System.out.print("\tNhập mã sinh viên: ");
			MaSV = sc.nextLine();
			SV.setMaSV(MaSV);
			
			System.out.print("\tNhập ngành: ");
			Nganh = sc.nextLine();
			SV.setNganh(Nganh);
			
			System.out.print("\tNhập khóa học: ");
			KhoaHoc = sc.nextInt();
			SV.setKhoaHoc(KhoaHoc);
			
			sc.nextLine();
			
			SV.nhap();
			list.add(SV);
		}
		
		/* Xuất */
		System.out.println();
		System.out.println("Mã lớp học: " + MaLH);
		System.out.println("Tên lớp học: " + TenLH);
		System.out.println("Ngày mở: " + NgayMo);
		System.out.println("Tên giáo viên: " + GiaoVien);
		
		System.out.format("%-5s %-12s %-12s %-10s %-16s %-14s %-12s\n", "STT" , "Mã SV", "Tên Ngành", "Khóa học", "Họ Tên", "Ngày Sinh", "Quê quán");
		for(int i=0;i<n;i++) {
			list.get(i).xuat();
			LopHoc.stt++;
		}
		
		checkK15(list, 15);
		
		System.out.println("\n\t\t\t Danh sách lớp học sau khi sắp xếp");
		sapXep(list);
		System.out.format("%-5s %-12s %-12s %-10s %-16s %-14s %-12s\n", "STT" , "Mã SV", "Tên Ngành", "Khóa học", "Họ Tên", "Ngày Sinh", "Quê quán");
		for(int i=0;i<list.size();i++) {
			list.get(i).xuat();
			LopHoc.stt++;
		}
	}

}
