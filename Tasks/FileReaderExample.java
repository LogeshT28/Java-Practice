package Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {
        String filePath = "\"C:\\Users\\loges\\OneDrive\\Desktop\\Test.txt\""; // Specify the path to your file
        StringBuilder fileContent = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the content of the file
        System.out.println(fileContent.toString());
    }
}

