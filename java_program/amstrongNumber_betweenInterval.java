import java.util.*;
public class java26 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=0;
        System.out.println("Amstrong number are:");
        for(int i=num1;i<=num2;i++){
            int temp=i;
            int digit;
            while(temp!=0){
                 digit=temp%10;
                sum=sum+(digit*digit*digit);
                temp=temp/10;

            }if(sum==i){
                System.out.print(i+" ");
            }else{
                digit=0;
                sum=0;
            }
        }
    }
    
}
