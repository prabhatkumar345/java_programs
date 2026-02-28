import java.util.Scanner;

public class java30 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of change for :\n Sum-1 \n Sub-2 \n Mul-3 \n Div-4 \n Mod-5");
        int change=sc.nextInt();
        System.out.println("Enter the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(change){
            case 1: int sum=a+b;
            System.out.println("Sum="+sum);
            break;
            case 2: int sub=a-b;
            System.out.println("Subtraction="+sub);
            break;
            case 3: int mul=a*b;
            System.out.println("Multiplication="+mul);
            break;
            case 4: int div=a/b;
            System.out.println("Division="+div);
            break;
            case 5: int mod=a%b;
            System.out.println("Modulo="+mod);
            break;
            default :System.out.println("Enter the number between 1 and 5");

        }






    }
    
}
