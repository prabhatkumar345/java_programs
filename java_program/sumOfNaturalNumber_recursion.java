import java.util.Scanner;

public class sumOfNaturalNumber_recursion {
    public static int SumOf_Natural_Number(int number){
        if(number==0){
            return 0;
        }
        
        int sum=0;
        sum=SumOf_Natural_Number(number-1);
        sum=sum+number;
        return sum;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which want to sum:");
        int num=sc.nextInt();
        int sum=SumOf_Natural_Number(num);
        System.out.println("Sum="+sum);
        
    }
}
