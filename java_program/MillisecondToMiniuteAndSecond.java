import java.util.*;
public class MillisecondToMiniuteAndSecond {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the second in millisecond:");
        int ms=sc.nextInt();

        double totalsecond=ms/1000;
        System.out.println("Miilisecond to minitus:"+totalsecond/60);
        System.out.println("Millisecond to seconds:"+totalsecond);
        sc.close();

    }
    
}
