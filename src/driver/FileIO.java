package driver;

import java.util.Scanner;
import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        // Scanner object to read the file
        // PrintWriter object to write out to the file
        // try-with
        int total = 0;
        try (Scanner fileIn = new Scanner(new File("data/data.txt"));
             PrintWriter fileOut = new PrintWriter("data/results.txt")) {

            while(fileIn.hasNextInt()){
                total += fileIn.nextInt();
            }

            System.out.println(fileIn.next());

            fileOut.println("Total: " + total);

        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("Could not open data/data.txt or data/results.txt");
        }

    }
}

