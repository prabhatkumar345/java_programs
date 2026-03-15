import java.util.*;
public class count_Vowel_Consonent{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String str=sc.nextLine();
        int vowel=0;
        int consonent=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U'
            || str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                vowel++;
           }else if(Character.isLetter(str.charAt(i))){
            consonent++;

           }
        }
        System.out.println("No of vowels in string:"+vowel);
        System.out.println("No of consonent in string:"+consonent);
        sc.close();

    }
}