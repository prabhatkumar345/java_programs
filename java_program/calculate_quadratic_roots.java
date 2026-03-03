import java .util.Scanner;
import java.math.*;
public class calculate_quadratic_roots {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=7;
        int b=3;
        int c=-2;
        double root1=(-b+(Math.sqrt(b*b-(4*a*c))))/2*a;
        double root2=(-b-(Math.sqrt(b*b-(4*a*c))))/2*a;

        System.out.println("Root1="+(int)root1);
        System.out.println("Root2="+(int)root2);
    }
    
}
