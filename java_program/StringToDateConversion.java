import java.util.*;
import java.text.SimpleDateFormat;

public class StringToDateConversion {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        String strdate="06-08-2006";
        try{
            SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
        Date date=formatter.parse(strdate);
        System.out.println("Date Conversion:"+date);
    }
    catch(Exception e){
        e.printStackTrace();

    }
    }
    
}
