package Bai1;

public class RunMain {

	public static void main(String[] args) {
		Person person1 = new Person("Nguyễn Văn A", 20, "Nam", "Chơi Game");
		Person person2 = new Person("Nguyễn Thị A" , 19, "Nữ", "Ngủ");
		System.out.println(person1.toString());
		System.out.println(person2.toString() + "\n");
		
		Person person = new Person();
		
		person.setName("Phạm Văn B");
		person.setAge(20);
		person.setGender("Nam");
		person.setHobby("Xem phim");
		System.out.println("Name  : " + person.getName());
		System.out.println("Age   : " + person.getAge());
		System.out.println("Gender: " + person.getGender());
		System.out.println("Hobby : " + person.getHobby() + "\n");
		
		person.setName("Phạm Thị B");
		person.setAge(19);
		person.setGender("Nữ");
		person.setHobby("Du lịch");
		System.out.println("Name  : " + person.getName());
		System.out.println("Age   : " + person.getAge());
		System.out.println("Gender: " + person.getGender());
		System.out.println("Hobby : " + person.getHobby() + "\n");
	}

}
