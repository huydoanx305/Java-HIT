package Test1;

public class RunMain {
    public static void main(String[] args) {
        FileController fileController = new FileController();

        User user = new User(1, "1", "1");

        fileController.WriteUserToFile("D:/Users.DAT", user);
    }
}
