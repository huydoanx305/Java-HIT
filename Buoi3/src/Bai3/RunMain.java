package Bai3;

import java.util.Random;

public class RunMain {

	public static void main(String[] args) {
		Random rd = new Random();
		Guns A = new Guns();
		Guns B = new Guns();
		
		A.setWeaponName("AK 47");
		A.setAmmoNumber(100);
		
		B.setWeaponName("M4A1");
		B.setAmmoNumber(100);
		
        while(A.getAmmoNumber() != 0 && B.getAmmoNumber() != 0){
            A.Shoot(rd.nextInt(10) + 1);
            B.Shoot(rd.nextInt(10) + 1);
            if(A.getAmmoNumber() == 0 && B.getAmmoNumber() == 0) {
            	System.out.println("Nạp đạn bắn tiếp" + "\n");
            	A.Load(rd.nextInt(10) + 1);
		        B.Load(rd.nextInt(10) + 1);
            }
            else {
            	if (A.getAmmoNumber() == 0) {
            		 System.out.println("Doan lose");  
            		 break;
            	}
            	if(B.getAmmoNumber() == 0){
            		 System.out.println("Điệp lose");
            		 break;
            	}
            } 
        }
	}		
}