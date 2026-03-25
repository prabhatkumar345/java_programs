import java.util.Scanner;

public class CharacterToStringViceVersa{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String str=sc.nextLine();
        System.out.println("Converted into character:");
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }System.out.println();
        System.out.println("Enter the size of array:");
        int num=sc.nextInt();
        System.out.println("Enter any "+num+" chacter:");
     
            String arr[]=new String[num];
            for(int i=0;i<num;i++){
                String c=sc.next();
                arr[i]=c;
            }
            System.out.println("Converting entered character into string:");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }sc.close();
        
        
        
        
        

    }
    
}
