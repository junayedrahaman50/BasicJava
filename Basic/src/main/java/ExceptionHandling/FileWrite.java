package ExceptionHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Java", "PrintWriter", "FileWriter"};

        // Create a file
        File file = new File("C://My Files/output4.txt");
        PrintWriter pw = null;
        

        try {
            // Create FileWriter with append flag set to false to overwrite existing content
            // fw = new FileWriter(file, false);
            // Create PrintWriter using FileWriter
            pw = new PrintWriter(new FileWriter(file, false));

            // Write array elements to the file
            for (String str : arr) {
                pw.println(str);
            }
            
            System.out.println("Array elements written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if(pw != null){
                // Close PrintWriter
                pw.close();
                System.out.println("Resource Closed!");
            }
            else{
                System.out.println("PrintWriter not used!");
            }
        }
    }
}
