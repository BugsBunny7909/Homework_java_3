package Homework3;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, CustomIOException {

        String fp = "C:\\Users\\Thunderobot\\Desktop\\Java\\src\\Homework3\\testFile.txt";

        System.out.println("ЗАПИСЬ В ФАЙЛ");
        System.out.println("Введите текст для записи:");
        String text = new Scanner(System.in).nextLine();
        ReadWriteClass.writeData(fp, text);

        System.out.println(String.format("\nЧТЕНИЕ ИЗ ФАЙЛА %s", fp));
        System.out.println("В файле написано: " + ReadWriteClass.readData(fp));
    }
}