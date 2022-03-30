package Bai3;

public class SinhVien extends Nguoi { 
	private String MaSV;
	private String Nganh;
	private int KhoaHoc;
	
	@Override
	public void xuat() {
		System.out.format(" %-5d %-12s %-12s %-10d", LopHoc.stt , MaSV, Nganh, KhoaHoc);
		super.xuat();
	}
	
	public SinhVien() {
	}
	public SinhVien(String maSV, String nganh, int khoaHoc) {
		MaSV = maSV;
		Nganh = nganh;
		KhoaHoc = khoaHoc;
	}
	public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nganh, int khoaHoc) {
		super(hoTen, ngaySinh, queQuan);
		MaSV = maSV;
		Nganh = nganh;
		KhoaHoc = khoaHoc;
	}
	
	public String getMaSV() {
		return MaSV;
	}
	public void setMaSV(String maSV) {
		MaSV = maSV;
	}
	public String getNganh() {
		return Nganh;
	}
	public void setNganh(String nganh) {
		Nganh = nganh;
	}
	public int getKhoaHoc() {
		return KhoaHoc;
	}
	public void setKhoaHoc(int khoaHoc) {
		KhoaHoc = khoaHoc;
	}
	
	
	
}
