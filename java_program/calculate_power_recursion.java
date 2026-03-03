import java.util.*;
public class calculate_power_recursion{
    public static int calculate_power(int num1,int num2){
       
        if(num2==0){
            return 1;
        }
        
       int cal=1;
        int power=calculate_power(num1, num2-1);
        cal=power*num1;
        return cal;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and power of base:");
        int base=sc.nextInt();
        int power=sc.nextInt();
        System.out.println("Power:"+calculate_power(base,power));
    }
    
}
