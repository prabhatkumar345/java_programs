import java.util.*;
public class greatestElement_ofArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements you want to insert in array:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        //finding biggest element from the array
        int large=0;
        for(int i=0;i<num;i++){
            if(arr[0]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[0];
                arr[0]=temp;
                large=arr[0];
            }
        }System.out.println("Greatest element in the array is:"+arr[0]);

    }
    
}
