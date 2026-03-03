
    //package java_program;
import java.util.Scanner;
public class reverse_aNumber {

    

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
        System.out.println("NUmber="+num+"     Reverse="+reverse);


    }
    
}
    
