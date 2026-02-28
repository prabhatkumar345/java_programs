import java.util.Scanner;

public class java24 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num=sc.nextInt();
        int num1=sc.nextInt();
        System.out.println("Prime numbers are:");
        for(int i=num;i<=num1;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }if(count<=2){
                System.out.print(i+" ");
                count=0;
            }else{
                count=0;
            }
        }

    }
    
}
