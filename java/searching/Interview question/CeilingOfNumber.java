class CeilingOfNumber{
    public static void main(String[] args) {
        int arr[]={2,3,5,6,12};
        System.out.println(find(arr,13));
    }

    static int find(int arr[],int target){
        int s=0,e=arr.length-1,mid=0;
        if(arr[e]<target) return -1;
        while (s<=e) {
            mid=s+(e-s)/2;
            if(arr[mid]==target) return target;
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return arr[s];
    }
}