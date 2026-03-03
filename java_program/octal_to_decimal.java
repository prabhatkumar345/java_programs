import java.util.*;
public class octal_to_decimal{
    public static void conversion(int num1,int num2){
        //octal to decimal
        int temp1=num1;
        int temp2=num2;
        int power=0;
        int dec_conversion=0;
        while(temp1!=0){
            int rem=temp1%10;
            if(rem>7){
               dec_conversion=0;
                break;
            }else{
            dec_conversion+=(Math.pow(8, power)*rem);
            temp1/=10;
            power++;
        }
         }if(dec_conversion>0){
            System.out.println("Octal no:"+num1+" to decimal no:"+dec_conversion);
         }else{
            System.out.println("First entered number is not an octal number.");
         }
         //decimal to octal
         int oct_conversion=0;
         int place=1;

         while(temp2!=0){
            int rem=temp2%8;
            oct_conversion+=(rem*place);
            place*=10;
            temp2/=8;

         }System.out.println("Decimal no:"+num2+" to Octal no:"+oct_conversion);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number as octal and second number as decimal number:");
        int octal=sc.nextInt();
        int decimal=sc.nextInt();
        conversion(octal,decimal);
    }
    
}
