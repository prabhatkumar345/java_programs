//package java_program;
import java.util.Scanner;
public class java21 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int reverse=0;
         
        while(temp!=0){
            int digit=temp%10;
            reverse=(reverse*10)+digit;
            temp=temp/10;
        }
        if(num==reverse){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("No. is not palindrome");
        }


    }
    
}
