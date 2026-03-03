import java.util.*;
public class calculate_lcm{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int lcm=1;
        int div=2;
        int a=num1;
        int b=num2;
        while(a>1 || b>1){
            if(a%div==0 || b%div==0){
                lcm=lcm*div;
                if(a%div==0){
                    a=a/div;

                }if(b%div==0){
                    b=b/div;

                }
            }else{
            div++;}
        }
        System.out.println("LCM:"+lcm);
    }
    
}
