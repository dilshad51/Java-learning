public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

        int arr[] = {4,5,6,7,0,1,2};
        int target=7;

        System.out.println(search(arr,target));
        
    }

    static int search(int[] arr, int target){
        int p=pivot(arr);

        if(p==-1) {
            return binarySearch(arr,target,0,arr.length-1);
        }
        else if(arr[p]==target) return p;
        else if(arr[0]<=target) return binarySearch(arr,target,0,p-1);
        else return binarySearch(arr,target,p+1,arr.length-1);
    }

    static int pivot(int arr[]){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]) return mid;
            else if(s<mid && arr[mid]<arr[mid-1]) return mid-1;
            else if(arr[s]>arr[mid]) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }

    static int binarySearch(int arr[],int target,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
    
}