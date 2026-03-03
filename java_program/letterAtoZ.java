import java.util.Scanner;

public class letterAtoZ {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Letters from A to Z:");
        for(char ch='A';ch<='Z';ch++){
            System.out.print(ch+" ");
        }
    }
    
}
