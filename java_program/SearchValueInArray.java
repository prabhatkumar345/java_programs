import java.util.*;
public class SearchValueInArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("Insert elements in the array:");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements you want to search:");
        int value=sc.nextInt();
        int temp=0;
        for(int i=0;i<num;i++){
            if(value==arr[i]){
                temp++;
                System.out.println("Value found at index:"+i);
            }
        }if (temp<=0){
            System.out.println("Value not found in array:");
        }
        sc.close();
    }
    
}
