package ss16_io_text_file.thuc_hanh.sum_value_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Element want input");
        int element = Integer.parseInt(scanner.nextLine());
        int[] array = new int[element];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a value " + (i + 1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("src/ss16_io_text_file/thuc_hanh/sum_value_File/number");
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Integer i : array) {
                bufferedWriter.write(i);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
        }

    }

