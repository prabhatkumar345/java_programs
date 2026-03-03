import java.util.*;
public class reverse_string{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type any sentence:");
        String str=sc.nextLine();
        int len=str.length();
        for(int i=(len-1);i>=0;i--){
            System.out.print(str.charAt(i));
        }

    }
    
}
