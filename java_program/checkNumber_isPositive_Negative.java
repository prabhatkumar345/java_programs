import java.util.*;
public class checkNumber_isPositive_Negative {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        if(num/1>=0){
            System.out.println("Entered number is positive ");
        }else{
            System.out.println("Entered number is negative");
        }
    }} 