import java.util.Arrays;

class FirstLastPositionOfElement {
    public static void main(String[] args){
        int arr[]={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }


    static int[] searchRange(int arr[] ,int target){
        int first=searchFirst(arr,target);
        int last=searchLast(arr, target);
        return new int[]{first,last};
    }

    static int searchFirst(int arr[],int target){
        int s=0,e=arr.length-1;
        int first=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                e=mid-1;
                first=mid;
            }
            else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return first;
    }

    static int searchLast(int arr[],int target){
        int s=0,e=arr.length-1;
        int last=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                s=mid+1;
                last=mid;
            }
            if(target<arr[mid]) e=mid-1;
            else s=mid+1;
        }
        return last;
    }
}