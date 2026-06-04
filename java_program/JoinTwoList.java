import java.util.*;
public class JoinTwoList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of list1: ");
        int num1=sc.nextInt();
        List<String> l1=new ArrayList<>();
        System.out.println("Enter the elements in the List1: ");
        for(int i=0;i<=num1;i++){
            l1.add(sc.nextLine());
        }
        System.out.println("Enter the size of list12: ");
        int num2=sc.nextInt();
        List<String> l2=new ArrayList<>();
        System.out.println("Enter the elements in the List2: ");
        for(int i=0;i<=num2;i++){
            l2.add(sc.nextLine());
        }
        System.out.println("List elements after concating list1 and list2:");
        List<String> result=new ArrayList<>();
        for(int i=0;i<l1.size();i++){
            result.add(l1.get(i));

        }
        for(int i=0;i<l2.size();i++){
            result.add(l2.get(i));

        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        } sc.close();
        
    }
    
}
