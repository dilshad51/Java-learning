public class FindInMountainArray {
    public static void main(String[] args) {

        int arr[]={ 1,2,3,4,5,7,5,3,2,1};
        int target =1;

        int s=0,e=arr.length-1;
        int peak=find(arr);
        int a=search(arr,target,s,peak);
        if(a!=-1)System.out.println(a);
        else{
            int b=search(arr,target,peak,e);
            System.out.println(b);
        }
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
    static int search(int arr[],int target,int s,int e){
        boolean isAsc =arr[s]<arr[e];
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
