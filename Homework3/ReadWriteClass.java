package Homework3;

import java.io.*;

public class ReadWriteClass {

    static void writeData(String filepath, String text) throws CustomIOException, FileNotFoundException {
        //Попытка открыть файл
        try (FileOutputStream fos = new FileOutputStream(filepath)) {

            //Перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
            System.out.println("Файл записан");
        } catch (CustomIOException ex) {

            System.out.println(ex.getMessage());
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {

        }
    }

    static String readData(String filepath) throws CustomIOException {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fin = new FileInputStream(filepath)) {
            int readedByte;
            while ((readedByte = fin.read()) != -1) {
                System.out.println(readedByte);
                sb.append((char) readedByte);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            throw new CustomIOException("Проблема с чтением");
        }

        return sb.toString();
    }

}