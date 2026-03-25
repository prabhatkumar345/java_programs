import java.util.*;
public class ConcateTwoArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int num1=sc.nextInt();
        System.out.println("Enter the elements in the first array:");
        int arr1[]=new int[num1];
        for(int i=0;i<num1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of second array:");
        int num2=sc.nextInt();
        System.out.println("Enter the elements in the second array:");
        int arr2[]=new int[num2];
        for(int i=0;i<num2;i++){
            arr2[i]=sc.nextInt();
        }


       //result array storing concate array result
        int num3=num1+num2;
        int result[]=new int[num3];

        //copying arr1 in result array

        for(int i=0;i<num1;i++){
            result[i]=arr1[i];
        }
        //copying arr2 in result array
        for(int i=0;i<num2;i++){
            result[num1+i]=arr2[i];
        }
        //printing concate array
        for(int i=0;i<num3;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();


    }
    
}
