import java.util.*;
public class binaryTo_octal{
    public static void conversion(int num1,int num2){
        int temp1=num1;
        int temp2=num2;
        int place=1;
        int octal_conversion=0;
        while(temp1!=0){
            int group=0;
            int power=0;
            for(int i=0;i<3 && temp1!=0;i++){
                int rem=temp1%10;
                group+=Math.pow(2,power)*rem;
                power++;
                temp1/=10;

            }
            octal_conversion+=group*place;
            place*=10;

        }System.out.println("Binary no:"+num1+" to octal no:"+octal_conversion);

        
        int pos=1;
        int binary_conversion=0;
       
        while(temp2!=0){
            int rem=temp2%10;
            if(rem>7){
                System.out.println("Entered number is not an octal number.");
                break;
            }else{
            int count=0;
            int sequence=0;
            int position=1;
            while(rem!=0 || count!=3){
                int rema=rem%2;
                sequence+=rema*position;
                position*=10;
                rem/=2;
                count++;
            }
            binary_conversion+=sequence*pos;
            pos*=1000;
            temp2/=10;
        }
    }
        System.out.println("Octal no:"+num2+" to binary no:"+binary_conversion);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary and octal number:");
        int binary= sc.nextInt();
        int octal=sc.nextInt();
        conversion(binary,octal);
    }
}
