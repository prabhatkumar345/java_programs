import java.util.*;

public class frame1 {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number between 1_50");
   for(int i=0;i<5;i++){
    int var=sc.nextInt();
    list.add(var);
   }System.out.println(list);

           Iterator<Integer> it=list.iterator();
           while(it.hasNext()){
            int value=it.next();
            if(value>25){
                it.remove();
            }
           }
        System.out.println(list);



    }
}