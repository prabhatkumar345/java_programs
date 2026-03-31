import java.util.*;

public class ArrayToHashsetAndViceVersa {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements in the array:");
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.nextLine();
        }
        //Array to Hashset
        System.out.println("Array to HashSet:");
        HashSet<String> set=new HashSet<>(Arrays.asList(str));
        System.out.println(set);
        //HashSet to Array
        String newArray[]=set.toArray(new String[0]);
        System.out.println("Hashset To Array:");
        for(String item:newArray){
            System.out.print(item+" ");
        }System.out.println();
        
        sc.close();
    }
    
}
