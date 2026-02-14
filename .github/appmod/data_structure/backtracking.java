//import java.util.*;
public class backtracking {
    public static boolean issafe(int board[][],int row,int col,int number){
        
        //column
        for(int i=0;i<board.length;i++){
        if(board[i][col]==number){
            return false;

        }//row
        if(board[row][i]==number){
            return false;
        }//grid
       
    } int sr=3*(row/3);
    int sc=3*(col/3);
    for(int i=sr;i<sr+3;i++){ 
        for(int j=sc;j<sc+3;j++){
            if(board[i][j]==number){
                return false;
            }

        }
    } return false;}
    
    public static boolean helper(int board[][],int col,int row){
        if(row == board.length) {
            return true;
        }
 
        int nrow=0;
        int ncol=0;
        
        if(col==board.length-1){
            ncol=0;
            nrow=row+1;
        }else{
            ncol=col+1;
            nrow=0;
        }
        if(board[row][col]!='.'){
            if(helper(board,nrow,ncol)){
                return true;
            }else{
                for(int i=1;i<=9;i++){
                    
                    
                    if(issafe(board,row,col,i))
                        board[row][col]=(char)(i+'0');
                        if(helper(board, ncol, nrow))
                        return true;
                    else
                        board[row][col]='.';
                    
                }
            } 
            } 
       return false; }

     public static int backtracking(int board[][]){
        helper(board,0,0);
        return board.length;
        
        
    }

    public static  void main(String[] args) {
        int boad[][]={ };//=new board[][];
        backtracking(boad);
        for(int i=0;i<boad.length;i++){
            for(int j=0;j<boad.length;j++){
                System.out.println(boad[i][j]);
            }

        }
        } 
       
}