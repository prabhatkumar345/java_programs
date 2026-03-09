import java.util.*;
public class transpose_OfMatrix {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and col of matrix:");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int row1=col;
        int col1=row;
        int arr[][]=new int[row][col];
        int transpose[][]=new int[row1][col1];
        System.out.println("Enter elements in matrix1:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix1:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        //trans pose of matrix
        System.out.println("Transpose of matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        //printing transpose of matrix
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(transpose[i][j]+" ");
            }System.out.println();

        }
        sc.close();
        
    }
    
}
