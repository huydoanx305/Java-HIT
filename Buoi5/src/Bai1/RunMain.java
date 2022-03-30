package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	static int stt = 1;
	
	private static void checkHangSX(ArrayList<DieuHoa> list, String hangSX) {
		boolean check = false;
		double giaBanMin = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTenHangSX().compareToIgnoreCase(hangSX) == 0) {
				giaBanMin = list.get(i).getGiaBan();
				check = true;
			}
		}
		if (check == false){
            System.out.println("Không tồn tại hãng " + hangSX);
        }
		else {
			for (int i = 0; i < list.size(); i++)
                if(list.get(i).getTenHangSX().compareToIgnoreCase(hangSX) == 0 && list.get(i).getGiaBan() < giaBanMin)
                	giaBanMin = list.get(i).getGiaBan();
			stt = 0;
			System.out.println("\n\t\tCác sản phẩm hãng " + hangSX + " có giá bán thấp nhất");
			System.out.format("%-5s %-12s %-18s %-14s %-14s %-14s %-14s\n","STT", "Ma SP", "Ten SP", "Ten Hang SX", "Ngay Nhap", "Cong Suat" ,"Gia Ban");
			for(int i = 0; i < list.size(); i++)
				if(list.get(i).getGiaBan() == giaBanMin && list.get(i).getTenHangSX().compareToIgnoreCase(hangSX) == 0) {
					stt++;
					list.get(i).Xuat();
				}		
		}
	}
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Nhập số điều hòa: ");
	     int n = scanner.nextInt();
	     
	     ArrayList<DieuHoa> list = new ArrayList<>();
	     
	     for (int i = 0; i < n; i++) {
		     DieuHoa DH = new DieuHoa();
		     System.out.println("Nhập thông tin điều hòa thứ " + (i + 1));
		     DH.Nhap();
		     list.add(DH);
	     }
	     System.out.format("%-5s %-12s %-18s %-14s %-14s %-14s %-14s\n","STT", "Ma SP", "Ten SP", "Ten Hang SX", "Ngay Nhap", "Cong Suat" ,"Gia Ban");
	     for(int i = 0; i < n; i++) {
	    	 list.get(i).Xuat();
	    	 stt++;
	     }  
	     checkHangSX(list,"Electrolux");
	}
}



