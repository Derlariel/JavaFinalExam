package FileText;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) {
    JavaWriter();
    JavaReader();
    }

    public static void JavaWriter()  {

        try {
            FileWriter write = new FileWriter("c:/temp/output.txt");
            write.write("Hello World!");
            write.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void JavaReader(){
        try {
            FileReader read = new FileReader("c:/temp/input.txt");
            boolean data;
            while (data = read.read() != -1){
                System.out.printf("%d",data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
