// if i dont know given array is sorted in ascending order or descending order.


public class OrderAgnostic {
    public static void main(String[] args) {
        //int arr[]={1, 2, 5, 7, 9};
        //int arr[]={9, 7, 5, 2, 1};
        //int arr[] = {20, 18, 15, 10, 5};
        int arr[]={1,1,1,1,1};

        System.out.println(search(arr,1));
    }
    static int search(int arr[], int target){
        if(arr.length==0) return-1;
        int s=0,e=arr.length-1;
        if (arr[s]==arr[e]) return arr[s]==target ? s: -1;

        boolean isAsc = arr[s]<arr[e];
            while(s<=e){
                int mid=s+(e-s)/2;
                if(arr[mid]==target) return mid;
                if(isAsc){
                    if(arr[mid]<target) s=mid+1;
                    else e=mid-1;
                }else{
                    if(arr[mid]<target) e=mid-1;
                    else s=mid+1;
                }
            
            
            }
            return -1;
    }
}

