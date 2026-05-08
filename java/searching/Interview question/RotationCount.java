public class RotationCount {
    public static void main(String[] args) {
        int arr []= {15, 18, 2, 3, 6, 12};
        System.err.println(smallest(arr));
    }

    static int smallest(int arr[]){
        int s=0,e=arr.length-1;
        if(arr[s]<arr[e]) return s;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(s<mid && arr[mid]<arr[mid-1]) return mid;
            if(e>mid && arr[mid]>arr[mid+1]) return mid+1;
            if(arr[s]<arr[mid]) s=mid+1;
            else e=mid-1;
        }
        return 0;
    }

    // code for finding smallest
    // static int smallest(int arr[]){
    //     int s=0,e=arr.length-1;
    //     while(s<e){
    //         int mid=s+(e-s)/2;
    //         if(arr[mid]>arr[e]) s=mid+1;
    //         else e=mid;
    //     }
    //     return s;
    // }
}
