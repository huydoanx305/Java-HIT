package Test1;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public Scanner getScanner(){
        return this.scanner;
    }

    public void openFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void closeFileAfterWrite(String fileName) {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void openFileToRead(String fileName){
        try {
            scanner = new Scanner(Paths.get(fileName));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void closeFileAfterRead(String fileName){
        scanner.close();
    }

    //User
    public void WriteUserToFile(String fileName, User user){
        openFileToWrite(fileName);
        printWriter.println(
                user.getId() + "|" + user.getUsername() + "|" + user.getPassword()
        );
        closeFileAfterWrite(fileName);
    }

    public User CreateUserFromData(String data){
        String[] datas = data.split("\\|");
        User user = new User(Integer.parseInt(datas[0]), datas[1], datas[2]);
        return user;
    }

    public List<User> ReadUserFromFile(String fileName){
        openFileToRead(fileName);
        List<User> list = new ArrayList<>();
        while(scanner.hasNext()){
            String data = scanner.nextLine();
            User user = CreateUserFromData(data);
            list.add(user);
        }
        closeFileAfterRead(fileName);
        return list;
    }

    public void UpdateUserFile(List<User> list, String fileName){
        File file = new File(fileName);
        if(file.exists()){
            file.delete();
        }
        openFileToWrite(fileName);
        for(User user : list){
            printWriter.println(
                    user.getId() + "|" + user.getUsername() + "|" + user.getPassword());
        }
        closeFileAfterWrite(fileName);
    }
}
