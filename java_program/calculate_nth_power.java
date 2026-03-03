import java.util.Scanner;

public class calculate_nth_power {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exp=sc.nextInt();
        int ans=1;
        for(int i=0;i<exp;i++){
            ans=ans*base;

        }
        System.out.println("Ans="+ans);
    }
    
}
