import java.io.*;
public class WriteStuInfo {

    public void writer(int roll, String personal, String result) {
        String fileName = roll+".txt";
    File file = new File(fileName);
    try {
        FileWriter fWrite = new FileWriter(fileName);
        String allInfo= personal + result;
        fWrite.write(allInfo);
        fWrite.close();
    }catch (Exception e){
        System.out.println("Error writing file.");
    }
}
}
