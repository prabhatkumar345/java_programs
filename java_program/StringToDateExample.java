import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDateExample {
    public static void main(String[] args) {
        String dateString = "23-03-2026";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);

        System.out.println("Converted Date: " + date);
    }
}