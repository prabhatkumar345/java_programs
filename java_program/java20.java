import java.util.Scanner;

public class java20 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        if(temp==0){
            count++;
        }else{
            while(temp!=0){
                temp/=10;
                count++;
            }
        }
        System.out.println("no. of digits in integer:"+count);
    }
    
}
 