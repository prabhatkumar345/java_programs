public class quick {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void mergesort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            mergesort(arr,low,pi-1);
            mergesort(arr,pi+1,high);
            
        }
    }
    public static void main(String[] args) {
        int arr[]={345,34,6,3,67,43};
        int n=arr.length;
        mergesort(arr,0,n-1);
        //print
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    
    }
    
}
