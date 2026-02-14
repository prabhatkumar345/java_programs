import java .util.*;
public class frame {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<10;i++){
    int var=sc.nextInt();
    list.add(var);
   }System.out.println(list);
   System.out.print("enter the number which you want to find=");
   int value=sc.nextInt();
   for(int i=0;i<10;i++){
    if(list.get(i)==value){
        System.out.println("index="+i);
    }
   }
    }
}
