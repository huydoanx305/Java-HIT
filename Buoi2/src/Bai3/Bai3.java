package Bai3;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap chuoi: ");
		String str = sc.nextLine();
		int count = 0;
		float sum = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			char s = str.charAt(i);
			if(Character.isDigit(s))
			{
				count++;
				sum += (s - '0');
			}
		}
		if(count == 0)
			System.out.println("false");
		else {
			System.out.println("true");
			System.out.print("average = " + sum/count);
		}
	}

}
