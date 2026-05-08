public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int arr[]={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,565,767,888,912,934,956,987,999};
        System.out.println(find(arr,170));
    }

    static int find(int arr[],int target){
        int s=0,e=1;
        while(e<arr.length && target>arr[e]){
            s=e+1;
            e=2*s+1;
        }
        // by doubling the search size means(s to e distance) i can get the index out of bound but its an infinite array so its not problem
        return search(arr,target,s,e);
    }

    static int search(int arr[],int target,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target) return mid;
            else if(target>arr[mid]) s=mid+1;
            else e=mid-1;
        }
        return -1;
    }
}
