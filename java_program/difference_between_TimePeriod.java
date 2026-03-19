import java.util.*;
public class difference_between_TimePeriod{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the hour ,minutes,seconds for first time period:");
        int h1=sc.nextInt();
        int m1=sc.nextInt();
        int s1=sc.nextInt();
        System.out.println("Enter the hour ,minutes,seconds for second time period:");
        int h2=sc.nextInt();
        int m2=sc.nextInt();
        int s2=sc.nextInt();
        int t1=h1*3600+m1*60+s1;
        int t2=h2*3600+m2*60+s2;
        int diff;
        if(t1>t2){
            diff=t1-t2;
        }else{
            diff=t2-t1;
        }
        int hour=diff/3600;
        int minute=(diff%3600)/60;
        int second=diff%60;
        System.out.println("Time Period Difference:"+hour+":"+minute+":"+second);
        sc.close();
    }
    
}
