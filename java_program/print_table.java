import java.util.Scanner;

public class print_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print:");
        int num=sc.nextInt();
        int count=1;
        while(count<11){
            System.out.println(num+"*"+count+"="+count*num);
            count++;
        }
    }
    
}
