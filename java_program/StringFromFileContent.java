import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringFromFileContent {
    public static void main(String[] args) {
        // Create File object
        
        File file = new File("C:\\Users\\Prabhat Kumar Pendro\\sudoku\\java_program\\JAVA.txt");

        StringBuilder content = new StringBuilder();

        try {
            // Create FileReader object
            FileReader reader = new FileReader(file);

            int ch;
            // Read file character by character
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }

            reader.close();

            // Convert to String and print
            String fileContent = content.toString();
            System.out.println("File Content:\n" + fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
