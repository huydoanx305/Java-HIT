package Bai2;

import java.util.Scanner;

public class Array {
	private int n;
	private int[] arr;
	Scanner sc = new Scanner(System.in);
	
	public void inputData() 
	{
		do{
			System.out.print("Nhap n = ");
			n = sc.nextInt();
			if(n<=0)
				System.out.println("Nhap lai n! (n>0)");
		}while(n<=0);
		
		arr = new int[n];
	
		for(int i = 0; i < n; i++)
		{
			System.out.print("\tEnter a["+i+"] = ");
			arr[i] = sc.nextInt();
		}
	}
	
	public void show(){
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	public int sum()
	{
		int s = 0;
		for(int i = 0; i < n; i++)
			s += arr[i];
		return s;
	}
	public void Filter(boolean flag) {
        if(flag) {
        	for(int i = 0; i < n; i++)
            	if(arr[i] % 2 == 0)
            		System.out.print(arr[i] + " ");	
        }else{
        	for(int i = 0; i < n; i++)
            	if(arr[i] % 2 != 0)
            		System.out.print(arr[i] + " ");
        }
    }
	
	public Array() {}
	public Array(int[] arr, int n){
		this.arr = arr;
		this.n = n;
	}
	
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int[] getArr() {
		return arr;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
	
}