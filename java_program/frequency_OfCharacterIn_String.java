import java.util.*;
public class frequency_OfCharacterIn_String{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        int length=s.length();
        //calculating number of times a character occurs
        int arr[]=new  int[length];
        for(int i=0;i<length;i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<length;i++){
            int count=1;
            for(int j=i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }
            if(arr[i]!=-1){
                System.out.println((char)arr[i]+":"+count);
            }
        }
    }
}