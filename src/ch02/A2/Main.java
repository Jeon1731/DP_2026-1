package ch02.A2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            // f.readFromFile("file.txt"); // 지정된 파일을 찾을 수 없습니다.
            f.readFromFile("src/ch02/A2/file.txt");

            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");

            // f.writeToFile("newfile.txt");
            f.writeToFile("src/ch02/A2/newfile.txt");

            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
