import java.io.StringWriter;
import java.io.PrintWriter;
public class StackTraceToString {
    public static String StackTracetoString(Throwable throwable){
        StringWriter sw=new StringWriter();
        PrintWriter pw=new PrintWriter(sw);
        throwable.printStackTrace(pw);
        return sw.toString();

    }
    public static void main(String[]args){
        try{
            int result=10/0;

        }
        catch(Exception e){
            String StackTrace=StackTracetoString(e);
            System.out.println(StackTrace);
        }
    }
    

}
