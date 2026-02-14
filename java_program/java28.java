import java.util.*;
public class java28{
    public static void amstrong(int a,int b){
        System.out.print("Numbers :");
        int clk=0;
        int sum=0;
       
        
        for(int i=a;i<=b;i++){
           int temp=i;
           int digit;
            
            while(temp!=0){
            digit=temp%10;
            sum=sum+(digit*digit*digit);
            temp=temp/10;
        }if(sum==i){
            System.out.print(i+" ");
            clk=1;
            digit=0;
            sum=0;
           }else{
            sum=0;
           }
        }if(clk==0){
            System.out.println("There is no armstrong number");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        amstrong(num1,num2);

    }
    
}
