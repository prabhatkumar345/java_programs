import java.util.*;

public class calculate_gcd {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int num1=sca.nextInt();
        int num2=sca.nextInt();
        int count=1;
        int gcd=1;
        while(count<=num1 ||count<=num2){
            if(num1%count==0 && num2%count==0){
                gcd=count;
                
            }count++;
            
        }        
        System.out.println("Common greatest division:"+gcd);
    }
    
}
