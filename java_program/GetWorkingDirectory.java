import java.nio.file.Paths;

public class GetWorkingDirectory {
    public static void main(String[] args) {
        String cwd = Paths.get("").toAbsolutePath().toString();
        System.out.println("Current Working Directory: " + cwd);
    }
}