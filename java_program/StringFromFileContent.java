import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringFromFileContent {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Prabhat Kumar Pendro\\sudoku\\java_program\\JAVA.txt");
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(file);

            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }

            reader.close();
            String fileContent = content.toString();
            System.out.println("File Content:\n" + fileContent);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
