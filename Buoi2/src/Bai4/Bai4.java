package Bai4;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap chuoi: ");
		String str = sc.nextLine();
		str = str.trim();
		while (str.indexOf("  ") != -1) str = str.replaceAll("  "," ");
		str = str.replaceAll("[0-9]","");
		str = properNoun(str);
		System.out.println("Chuoi sau khi chuan hoa: " + str);
	}
	public static String properNoun(String s) {
		s = s.toLowerCase();
        String[] temp = s.split(" ");
        String s1 = ""; 
        for (int i = 0; i < temp.length; i++) {
            s1 += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                s1 += " ";
        }
        return s1;
    }
}
