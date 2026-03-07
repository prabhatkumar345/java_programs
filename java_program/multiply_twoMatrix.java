import java.util.Scanner;

public class multiply_twoMatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row1");
        int row1=sc.nextInt();
        System.out.println("Enter col1");
        int col1=sc.nextInt();
        System.out.println("Enter row2");
        int row2=sc.nextInt();
        System.out.println("Enter col2");
        int col2=sc.nextInt();
        if(col1!=row2){
            System.out.println("Multiplication of matrix is not possible.");

        }else{
        int arr1[][]=new int[row1][col1];
        int arr2[][]=new int[row2][col2];
        System.out.println("Enter mtrix 1:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter mtrix 2:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix:1");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(arr1[i][j]+" ");
            }System.out.println();
        }
        System.out.println("Matrix:2");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(arr2[i][j]+" ");
            }System.out.println();
        }
        //multiplicaion of two matrix
        int result[][]=new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    result[i][j]+=arr1[i][k]*arr2[k][j];

                }
                
            }
        }
        //printing result
        System.out.println("Multiplication of matrix:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(result[i][j]+" ");
            }System.out.println();
        }
    }



    }
    
}
