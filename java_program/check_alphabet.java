import java.util.*;
public class check_alphabet {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char al=sc.nextLine().charAt(0);
        
        if((al>='A'&& al<='Z')||('a'<=al && al<='z')){
            System.out.println("Etered value is alphabet");
        }else{
            System.out.println("Entered value is not alphabet");
        }

        }
    } 
    
    




