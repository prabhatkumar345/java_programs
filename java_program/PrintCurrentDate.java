import java.time.LocalDate;

public class PrintCurrentDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);
    }
}