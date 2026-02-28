
import java.util.Scanner;
public class java27 {
    public static void prime_number(int a,int b){
        int clk=0;
        System.out.print("Prime numbers are: ");
       if(a<b)
        { for(int i=a;i<=b;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }if(count<=2){
                System.out.print(i+" ");
                clk=1;
            }else{
                count=0;
            }
        }
    }else if(a>b){
        for(int i=b;i<=a;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }if(count<=2){
                System.out.print(i+" ");
                clk=1;
            }else{
                count=0;
            }
        }
        
        }
        if(clk ==0){
            System.out.println("There is no prime number;");
        }


    }
    
    

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      int num1=sc.nextInt();
      int num2=sc.nextInt();
      prime_number(num1, num2);
        
    }
    
}

