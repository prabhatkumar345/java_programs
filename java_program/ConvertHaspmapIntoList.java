import java.util.*;
public class ConvertHaspmapIntoList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of enteries in HahMap:");
        int n=sc.nextInt();
        HashMap<Integer,String> map=new HashMap<>();
        System.out.println("Enter enteries in the HashMap:");
        for(int i=0;i<n;i++){
            System.out.print("Enter key(Integer):");
            int key=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter value(String):");
            String value=sc.nextLine();
            map.put(key,value);
        }
        //Converting keys into list
        List<Integer> keyList=new ArrayList<>(map.keySet());
         //Converting values into list
         List<String> valueList=new ArrayList<>(map.values());
         //converting entries into list
         List<Map.Entry<Integer,String>> entryList=new ArrayList<>(map.entrySet());

         System.out.println("Keys:"+keyList);
         System.out.println("Values:"+valueList);
         System.out.println("HashMap:"+map);

         System.out.println("Entries List:");
         for(Map.Entry<Integer,String> entry: entryList){
            System.out.println(entry.getKey()+"->"+entry.getValue());
         }sc.close();
    }
    
}
