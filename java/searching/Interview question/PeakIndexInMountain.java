public class PeakIndexInMountain {
    public static void main(String[] args) {
        int arr[]={0,1,2,5,8,9,10,3,1};
        System.out.println(find(arr));
    }

    static int find(int arr[]){
        int s=0,e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]) s=mid+1;
            else e=mid;
        }
        return s;
    }
}
