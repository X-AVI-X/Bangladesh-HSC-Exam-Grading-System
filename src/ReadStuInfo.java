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
            System.out.println("Error occurred while reading file.");
            e.printStackTrace();
        }
    }
}
