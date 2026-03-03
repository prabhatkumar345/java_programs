import java.util.Scanner;

public class calculate_standardDeviation{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array:");
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=arr[i];
        }
        System.out.println("Mean of array elements:"+(double)sum/num);
        double summation=0;
        for(int i=0;i<num;i++){
            summation+=(Math.pow(arr[i]-(double)(sum/num),2));

        }System.out.println("Standard Deviation:"+Math.sqrt(summation/num));

    }
    
}
