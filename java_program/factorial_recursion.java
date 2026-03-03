import java.util.Scanner;

public class factorial_recursion{
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        if(num==1){
            return 1;
        }
        int fact=1;
        fact=factorial(num-1);
        fact=fact*num;
        return fact;

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want:");
        int num=sc.nextInt();
        System.out.println("Factorial:"+factorial(num));


    }
}