public class BinarySearch {
    public static void main(String[] args){
        int arr[]={1, 2, 5, 7, 9};
        int arr2[]={9, 7, 5, 2, 1};

        System.out.println(search(arr,2));
        System.out.println(search2(arr2,7));
    }

// if array is sorted in increasing order
// {1, 2, 5, 7, 9}

    static int search(int [] arr, int target){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) s=mid+1;
            else if (arr[mid]>target) e=mid-1;
        }
        return -1;
    }
    // if array i ssorted in decreasing order
    // {9, 7, 5, 2, 1}

    static int search2(int []arr,int target){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
}
