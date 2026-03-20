import java.util.*;
public class RemoveWhiteSpaceBetweenString {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        String str=sc.nextLine();
        int len=str.length();
        String ans=" ";
          
        
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            if(c!='\t'&& c!='\n'&& c!=' '){
                ans=ans+c;
            }
            
        }System.out.println("Original String:"+str);
        System.out.println("New String:"+ans);
        sc.close();
    }
    
}
