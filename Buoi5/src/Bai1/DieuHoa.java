package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
	private int CongSuat;
	private double GiaBan;
	
	@Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.print("\tNhập công suất: ");
        CongSuat = scanner.nextInt();
        System.out.print("\tNhập giá bán: ");
        GiaBan = scanner.nextDouble();
    }
	
	@Override
    public void Xuat() {
		super.Xuat();
    	System.out.format(" %-14d %-14.2f\n", CongSuat, GiaBan);
    }
	
	public double getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(double giaBan) {
		GiaBan = giaBan;
	}
	
	
}
