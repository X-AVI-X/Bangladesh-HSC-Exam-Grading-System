import java.io.*;
import java.util.Scanner;


public class ReadStuInfo{

    public void reader(int roll) {
        String fileName= roll+".txt";
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred while reading file/Your file doesn't exists.");
            System.out.println("Create new student result file to generate result and to see it later using roll.");
        }
        finally {
            System.out.println();
            System.out.println("Exiting file reading module...");
            System.out.println("Going back to main menu...");
        }
    }
}
