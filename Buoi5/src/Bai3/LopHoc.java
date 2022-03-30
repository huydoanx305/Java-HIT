package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LopHoc {
	private String MaLH;
	private String TenLH;
	private String NgayMo;
	private ArrayList<SinhVien> list;
	private int n;
	private String GiaoVien;
	static int stt = 1;
	
	public LopHoc() {
	}
	public LopHoc(String maLH, String tenLH, String ngayMo, ArrayList<SinhVien> list, int n, String giaoVien) {
		super();
		MaLH = maLH;
		TenLH = tenLH;
		NgayMo = ngayMo;
		this.list = list;
		this.n = n;
		GiaoVien = giaoVien;
	}
	public String getMaLH() {
		return MaLH;
	}
	public void setMaLH(String maLH) {
		MaLH = maLH;
	}
	public String getTenLH() {
		return TenLH;
	}
	public void setTenLH(String tenLH) {
		TenLH = tenLH;
	}
	public String getNgayMo() {
		return NgayMo;
	}
	public void setNgayMo(String ngayMo) {
		NgayMo = ngayMo;
	}
	public ArrayList<SinhVien> getList() {
		return list;
	}
	public void setList(ArrayList<SinhVien> list) {
		this.list = list;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getGiaoVien() {
		return GiaoVien;
	}
	public void setGiaoVien(String giaoVien) {
		GiaoVien = giaoVien;
	}
}



