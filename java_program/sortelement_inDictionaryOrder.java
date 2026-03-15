import java.util.*;
public class sortelement_inDictionaryOrder {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of elements:");
        int num=sc.nextInt();
        String words[]=new String[num];
        System.out.println("Enter the elements of string type in array:");
        for(int i=0;i<num;i++){
            words[i]=sc.nextLine();

        }
        //comparing elements of array
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if(words[i].compareTo(words[j])>0){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }

        }
        System.out.println("Arranged elements of array:");
        for(String word:words){
            System.out.print(word+" ");
        }
        sc.close();
    }
    
}
