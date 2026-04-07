import java.io.FileWriter;
import java.io.IOException;

public class AppendInFile {
    public static void main(String[] args) {
        String filePath = "JAVA.txt";
        String textToAppend = "I am Prabhat Kumar Pendro.\n";

        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(textToAppend);
            writer.close();
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}