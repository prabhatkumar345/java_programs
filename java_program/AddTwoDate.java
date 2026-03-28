//PROGRAMM TO ADD TWO DATES
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class AddTwoDate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date in "+"dd-mm-yyyy"+" format.");
        System.out.println("Enter first date:");
        String d1=sc.nextLine();
        System.out.println("Enter second date:");
        String d2=sc.nextLine();
        //Converting String Date to Acctual Date Format
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1=LocalDate.parse(d1,f1);
        LocalDate date2=LocalDate.parse(d2,f1);
        long days=ChronoUnit.DAYS.between(date1,date2);
        System.out.println("Addition Of Two Date:"+days);
        sc.close();
        
    }
    
}
