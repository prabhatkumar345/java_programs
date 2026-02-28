import java.util.*;
public class java29{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factors of num: ");
        if(num==1){
            System.out.println("Enter number greater thn 1");
        }
        for(int i=1;i<=num;i++){
            
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
