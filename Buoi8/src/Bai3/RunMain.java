package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<News> list = new ArrayList<>();
	
	public static void cn1() {
		News N = new News();
		sc.nextLine();
		System.out.print("\nEnter ID: ");
		N.setId(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Title: ");
		N.setTitle(sc.nextLine());
		System.out.print("Enter Publish Date: ");
		N.setPublishDate(sc.nextLine());
		System.out.print("Enter Author: ");
		N.setAuthor(sc.nextLine());
		System.out.print("Enter Content: ");
		N.setContent(sc.nextLine());
		
		System.out.println("Please enter 3 rate");
		News.rateList = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter rate "+ (i+1) +": ");
			News.rateList[i] = sc.nextInt();
		}
		list.add(N);
	}
	public static void main(String[] args) {
		int choose;
		do {
			System.out.println("\t++=======* MENU *=======++");
			System.out.println("1. Insert news              ");
			System.out.println("2. View list news           ");
			System.out.println("3. Average rate             ");
			System.out.println("4. Exit                     ");
			System.out.print("I will choose: ");
			choose = sc.nextInt();
			
			switch (choose) {
				case 1: 
					cn1();
					break;
				case 2: 
					System.out.println("\n=== List News ===");
					list.get(0).Display();
					break;
				case 3: 
					System.out.println("\n=== List News ===");
					list.get(0).Calculate();
					list.get(0).Display();
					break;
				case 4:
					System.out.println("++ Exited the program ++");
					System.exit(0);
					break;
				default: System.out.println("Invalid selection!\n");
			}
		}while(true);
	}

}
