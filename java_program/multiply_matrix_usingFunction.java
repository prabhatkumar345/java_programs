import java.util.Scanner;

public class multiply_matrix_usingFunction {
    public static void matrix_multiplication(int A[][],int B[][],int row1,int col1,int row2,int col2){
        int result[][]=new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    result[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        //printing result matrix 
        System.out.println("Result matrix:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(result[i][j]+" ");
            }System.out.println();
        }


    }
    
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
        //inserting elements in array
        System.out.println("Enter elements for matrix 1:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j]=sc.nextInt();

            }
        }
        System.out.println("Enter elements in matrix 2:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j]=sc.nextInt();

            }
        }

        //calling dunction
        matrix_multiplication(arr1,arr2,row1,col1,row2,col2);
    }
    }
    
}
