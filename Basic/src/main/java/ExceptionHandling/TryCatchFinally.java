package ExceptionHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TryCatchFinally {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Java", "PrintWriter", "FileWriter"};

        // Create a file
        File file = new File("output.txt");

        try {
            // Create FileWriter with append flag set to false to overwrite existing content
            FileWriter fw = new FileWriter(file, false);
            // Create PrintWriter using FileWriter
            PrintWriter pw = new PrintWriter(fw);

            // Write array elements to the file
            for (String str : arr) {
                pw.println(str);
            }

            // Close PrintWriter and FileWriter
            pw.close();
            fw.close();

            System.out.println("Array elements written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
