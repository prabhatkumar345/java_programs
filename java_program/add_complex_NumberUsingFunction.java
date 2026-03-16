import java .util.*;
public class add_complex_NumberUsingFunction{
    public static void Adding_ComplexNumber(int r1,int i1,int r2,int i2 ){
        int real=r1+r2;
        int imag=i1+i2;
        System.out.println("Addition of complex number: "+real+"+"+imag+"i");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first real and imaginary number :");
        int r1=sc.nextInt();
        int i1=sc.nextInt();
        System.out.println("Enter second real and imaginary number :");
        int r2=sc.nextInt();
        int i2=sc.nextInt();
        Adding_ComplexNumber(r1,i1,r2,i2);
        sc.close();
    }
}