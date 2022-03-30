package Bai1;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài m = ");
		int m = scanner.nextInt();
		
		System.out.print("Nhập chiều rộng n = ");
		int n = scanner.nextInt();
		
		System.out.print("\n");
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(i == 1 || j == 1 || i == m || j == n)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
		System.out.print("\n");
		}
	}
}