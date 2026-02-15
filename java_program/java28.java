import java.util.*;
import java.math.*;
public class java28{
    public static boolean amstrong(int num){
    int real_number=num;
    int remainder,digit=0,result=0;
     int temp=num;
     //counting number of digits
     while(temp!=0){
        temp/=10;
        digit++;
     }
     temp=num;
     while(temp!=0){
        remainder=temp%10;
        result=result+(int)Math.pow(remainder, digit);
        temp/=10;

     }
     return result==real_number;
    
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower and  limit:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
       
        System.out.println("Amstrong number between lower and upper bound:");
        for(int i=num1;i<=num2;i++){
            if(amstrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    
}
