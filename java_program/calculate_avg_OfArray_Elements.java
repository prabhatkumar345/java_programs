import java.util.*;
public class calculate_avg_OfArray_Elements{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values you want to insert in array:");
        int num=sc.nextInt();
        int[] arr=new int[num];    ;
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=arr[i];
        }
        System.out.println("Average of array elements:"+(double)sum/num);
    }
}