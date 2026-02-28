import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits in fibonacci:");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibo series:");
        System.out.print(a+" " +b+" ");
        for(int i=0;i<num-2;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
    
}
