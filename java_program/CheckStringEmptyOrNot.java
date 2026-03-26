import java.util.Scanner;

public class CheckStringEmptyOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String str=sc.nextLine();
        if(str.isEmpty()
        ){
            System.out.println("String is empty.");
        }else{
            System.out.println("String is not empty.");
        }sc.close();
    }
    
}
