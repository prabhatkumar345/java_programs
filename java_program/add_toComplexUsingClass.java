import java.util.*;
public class add_toComplexUsingClass{
    public static class Conversion{
        int real;
        int imag;
        Conversion(int num1,int num2){
            real=num1;
            imag=num2;
        }
        void add(Conversion c1,Conversion c2){
             real=c1.real+c2.real;
             imag=c1.imag+c2.imag;
            

        }
        void display1(){
            System.out.println("ComplexNumber_1:"+real+"+"+imag+"i");
        }void display2(){
            System.out.println("ComplexNumber_2:"+real+"+"+imag+"i");
        }void display3(){
            System.out.println("AddingTwoComplexNumber:"+real+"+"+imag+"i");
        }
    }
        
        
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first real and imaginary number:");
    int real1=sc.nextInt();
    int imag1=sc.nextInt();
    System.out.println("Enter second real and imaginary number:");
    int real2=sc.nextInt();
    int imag2=sc.nextInt();
    Conversion c1=new Conversion(real1,imag1);
    
    Conversion c2=new Conversion(real2,imag2);
    Conversion result=new Conversion(0,0);
    c1.display1();
    c2.display2();
    result.add(c1,c2);
    result.display3();
sc.close();
}
}