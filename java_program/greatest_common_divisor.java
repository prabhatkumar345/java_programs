import java.util.*;
public class java34 {
    public static int Greatest_c_d(int num1,int num2,int rep,int ter){
         
        int gcd=1;
        if(rep>ter){
            return 1;
        }
         gcd=Greatest_c_d(num1,num2,rep+1,ter);
        if(num1%rep==0 && num2%rep==0){
            gcd=rep;
            return gcd;
        }
         return gcd;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ter=0;
        if(num1<num2){
            ter=num1;
        }
        else{
            ter=num2;
        }
        System.out.println("Greatest common divisor:"+Greatest_c_d(num1,num2,1,ter));
    }
    
}
