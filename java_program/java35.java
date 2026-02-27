import java.util.*;
public class java35{
    public static void conversion(int num1,int num2){
       
        int temp1=num1;
        int temp2=num2;
        double decimal=0;
        int power=0;
        int binary=0;
        int place=1;
       
        while(temp1!=0){
            int rem=temp1%10;
            decimal=decimal+(Math.pow(2,power)*rem);
            power++;
            temp1=temp1/10;

        }System.out.println("Binary no.:"+num1+" to decimal="+decimal);

       
        while(temp2!=0){
            int rem=temp2%2;
            binary=binary+rem*place;
            place=place*10;
            
            temp2=temp2/2;
        }
        System.out.println("Decimal no.:"+num2+" to binary="+binary);
        

    }
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any binary number and dedcimal number");
        int bin=sc.nextInt();
        int dec=sc.nextInt();

        conversion(bin,dec);
    }
}