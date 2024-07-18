package Tasks;

import java.io.*;
import java.util.*;

public class ReadingAndWritingAFile {
    public static void main(String[] args) {
        try {
            FileWriter fw  = new FileWriter("G:\\10Days Chellange\\Tasks\\output.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(" Logesh T");
            bw.newLine();
            bw.write("Mathan");
            bw.close();
            FileReader f = new FileReader("G:\\10Days Chellange\\Tasks\\output.txt");
            BufferedReader br = new BufferedReader(f);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.print(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
