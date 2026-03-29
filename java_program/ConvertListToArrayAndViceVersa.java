import java.util.*;

public class ConvertListToArrayAndViceVersa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of List:");
        int num=sc.nextInt();
        List <Integer> L1=new ArrayList<>();
        System.out.println("Enter elements in the list:");
        for(int i=0;i<num;i++){
            L1.add(sc.nextInt());
        }
        //converting list into Array
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=L1.get(i);
        }
        System.out.println("Printing List1:");
        for(int i=0;i<num;i++){
            System.out.print(L1.get(i)+" ");
        }System.out.println();
        System.out.println("Printing List1 which is converted into Array: ");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        System.out.println("Printing Array which is converted into List:");
        List<Integer> L2= new ArrayList<>();
        for(int i=0;i<num;i++){
            L2.add(arr[i]);
        }
        for(int i=0;i<num;i++){
            System.out.print(L2.get(i)+" ");
        }
    }    }
    

