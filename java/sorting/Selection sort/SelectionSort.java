import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int []arr= {3, 4, 1, 2, 5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maxIdx=0;
            int lastIdx=arr.length-1-i;
            for(int j=0;j<=lastIdx;j++){
                if(arr[j]>arr[maxIdx]) maxIdx=j;
            }
            swap(arr,maxIdx,lastIdx);
        }
    }
    static void swap(int []arr, int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
    }
}