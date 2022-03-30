package Bai1;

import java.util.*;

public class RunMain {
    public static void main(String[] args) {
    	List<Person> person = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter quantity of person: ");
            int n = sc.nextInt();
            sc.nextLine();
            
            for (int i = 0; i < n; i++) {
                Person P = new Person();
                System.out.print("\tEnter id: ");
                P.setId(sc.nextLine());
                System.out.print("\tEnter name: ");
                P.setName(sc.nextLine());
                System.out.print("\tEnter address: ");
                P.setAddress(sc.nextLine());
                System.out.println();
                
                person.add(P);
            }
            
            Collections.sort(person);
            System.out.println("====== Person list by ID ======");
            person.forEach(P -> System.out.println(P.toString()));
            
            Collections.sort(person, new Comparator<Person>() {
                @Override
                public int compare(Person o1, Person o2) {
                    if (o1.getName().compareTo(o2.getName()) == 0)
                    	return o2.getAddress().compareTo(o1.getAddress());
                    else
                    	return o1.getName().compareTo(o2.getName());
                }
            });
            System.out.println("\n====== Person list by Name ======");
            person.forEach(P -> System.out.println(P.toString()));
            
        } catch (Exception ex) {
            System.out.print("Error: Enter mismatch, please try again!");
        }
    }
}