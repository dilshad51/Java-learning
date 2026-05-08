public class RotatedWithDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target=3;
        System.out.println(search(arr, target));
        
    }

    static int search(int[] arr, int target){
        int p=pivot(arr);

        if(p==-1) {
            return binarySearch(arr,target,0,arr.length-1);
        }
        else if(arr[p]==target) return p;
        else if(target>=arr[0]) return binarySearch(arr,target,0,p-1);
        else return binarySearch(arr,target,p+1,arr.length-1);
    }

    static int pivot(int arr[]){
        int s=0,e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]) return mid;
            if(s<mid && arr[mid]<arr[mid-1]) return mid-1;
// if elements at s, mid, e are equals
            if(arr[s]==arr[mid] && arr[mid] == arr[e]){
// skip the duplicates
                // but what if these are pivot
                if(s<e && arr[s]>arr[s+1]) return s;
                s++;
                if(s<e && arr[e]<arr[e-1]) return e-1;
                e--;
            }

            else if(arr[s]<=arr[mid]) s=mid+1;
            else e=mid-1;
        }
        return e;
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
