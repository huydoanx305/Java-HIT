package Bai1;

import java.util.Scanner;

public class SanPham {
	protected String MaSP;
	protected String TenSP;
	protected String TenHangSX;
	protected String NgayNhap;
	
	
	public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tNhập mã sản phẩm: ");
        MaSP = scanner.nextLine();
        System.out.print("\tNhập tên sản phẩm: ");
        TenSP = scanner.nextLine();
        System.out.print("\tNhập tên hãng sản xuất: ");
        TenHangSX = scanner.nextLine();
        System.out.print("\tNhập ngày nhâp: ");
        NgayNhap = scanner.nextLine();
    }

    public void Xuat(){
    	System.out.format("%-5d %-12s %-18s %-14s %-14s",RunMain.stt, MaSP, TenSP, TenHangSX, NgayNhap);
    }

	public String getTenHangSX() {
		return TenHangSX;
	}
	
	public void setTenHangSX(String tenHangSX) {
		TenHangSX = tenHangSX;
	}
    
    
}
