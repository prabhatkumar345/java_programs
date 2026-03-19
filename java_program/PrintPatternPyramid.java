import java.util.*;
public class PrintPatternPyramid{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in pyramid:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=i;j<num-1;j++){
                System.out.print(" ");
                
            }for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }System.out.println();
        }
        sc.close();
    }
    
}
