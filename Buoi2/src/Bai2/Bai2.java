package Bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {

	public static void show(int[] a, int n)
	{
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static int[] addElement(int[] a, int n)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap phan tu can them: ");
		int value = sc.nextInt();
		int k;
		do{
			System.out.print("Nhap vi tri can them: ");
			k = sc.nextInt();
			if(k < 0 || k > n+1)
				System.out.println("Nhap lai k! ( k > 0 & k <= "+(n+1)+")");
		}while(k < 0 || k > n+1);
		
		int newIndex = n + 1;
		int[] newArray = Arrays.copyOf(a, newIndex);
		for(int i = newIndex - 1; i > k - 1; i--)
			newArray[i] = newArray[i-1];
		newArray[k-1] = value;
		
		return newArray;
	}
	public static int[] deleteElement(int[] a, int n) 
	{
		Scanner sc = new Scanner(System.in);
		int k;
		do{
			System.out.print("Nhap vi tri can xoa: ");
			k = sc.nextInt();
			if(k < 0 || k > n)
				System.out.println("Nhap lai k! ( k > 0 & k <= "+(n)+")");
		}while(k < 0 || k > n);
		
		int[] newArray = Arrays.copyOf(a, n);
		for(int i = k-1; i < n - 1; i++)
			newArray[i] = newArray[i+1];
		return newArray;
	}
	public static int[] reverseArray(int a[], int n)
	{
		int[] newArr = Arrays.copyOf(a, n);
		int x = 0;
		for(int i = n - 1; i >= 0; i--)
		{
			newArr[x++] = a[i];
		}
		return newArr;
	}
	public static void showNumber(int[] a, int n)
	{
		
		int count = 0;
		for(int i = 0; i < n; i++)
		{	
			if(a[i] != a[1] && a[i] % a[1] == 0)
				count++;
		}
		System.out.println("a[1] = " + a[1]);
		if(count == 0)
			System.out.println("Mang khong co so chia het cho a[1]!");
		else {
			System.out.print("Cac so chia het cho a[1]: ");
			for (int i = 0; i < n; i++) {
				if(a[i] != a[1] && a[i] % a[1] == 0)
					System.out.print(a[i] + " ");
			}
		}
		System.out.println("\n");
	}
	public static boolean isPrime(int n)
	{
		for (int i = 2; i*i <= n; i++)
	           if (n % i == 0) 
	               return false;
		return n > 1;
	          
	}
	public static int sumOfPrime(int[] a, int n)
	{
		int sum=0;
		for(int i = 0; i < n; i++)
			if(isPrime(a[i]))
				sum += a[i];
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon;
		int n = 0;
		int a[] = null;
		do {
			System.out.println("\t++=======* MENU *=======++");
			System.out.println("1. Nhap cac phan tu vao mang                   ");
			System.out.println("2. Hien thi mang vua nhap                      ");
			System.out.println("3. Thêm 1 phần tử vào vị trí k bất             ");
			System.out.println("4. Xóa 1 phần tử tại vị trí k bất k            ");
			System.out.println("5. Đảo ngược mảng                              ");
			System.out.println("6. Hiển thị a[1] và các số chia hết cho a[1]   ");
			System.out.println("7. Xuất ra tổng các số nguyên tố có trong mảng ");
			System.out.println("8. Thoat khoi chuong trình                     ");
			System.out.print("\nToi Se Chon: ");
			chon = sc.nextInt();
			
			switch (chon) {
				case 1: 
					do{
						System.out.print("Nhap n = ");
						n = sc.nextInt();
						if(n<=0)
							System.out.println("Nhap lai n! (n>0)");
					}while(n<=0);
					a = new int[n];
					for(int i = 0; i < n; i++)
					{
						System.out.print("\tNhap a["+i+"]" + " = ");
						a[i] = sc.nextInt();
					}
					break;
				case 2: 
					System.out.print("Mang vua nhap: ");
					show(a, n);
					break;
				case 3: 
					a = addElement(a, n);
					n++;
					System.out.println("++ Them thanh cong ++\n");
					break;
				case 4:
					a = deleteElement(a, n);
					n--;
					System.out.println("++ Xoa thanh cong ++\n");
					break;
				case 5:
					a = reverseArray(a, n);
					System.out.println("++ Dao mang thanh cong ++\n");
					break;
				case 6:
					showNumber(a, n);
					break;
				case 7:
					System.out.println("Tong cac so nguyen to trong mang sum = " + sumOfPrime(a, n) + "\n");
					break;
				case 8: 
					System.out.println("++ Da thoat khoi chuong trinh ++");
					System.exit(0);
					break;
				
				default: System.out.println("Lua chon khong hop le!\n");
			}
		}while(true);
	}

}
