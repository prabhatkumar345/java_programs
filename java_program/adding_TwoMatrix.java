import java.util.*;
public class adding_TwoMatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of column and row:");
        int col=sc.nextInt();
        int row=sc.nextInt();
        int arr1[][]=new int[row][col];
        int arr2[][]=new int[row][col];
         System.out.println("Enter first matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
               
            }
        }
        System.out.println("Enter second matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
               }
        }
        //printing matrix
        System.out.println("Matrix1:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr1[i][j]+"  ");
            }System.out.println();
        }System.out.println("Matrix2:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr2[i][j]+"  ");
            }System.out.println();
        }System.out.println();
        //Adding elements of matrix
        System.out.println("Adding elements of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print((arr1[i][j]+arr2[i][j])+" ");
            }
            System.out.println();
        }
    }
    
}