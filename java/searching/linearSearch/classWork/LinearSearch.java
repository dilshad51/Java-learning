import java.util.*;
public class LinearSearch{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int nums[]={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.print("Enter element to find: ");
        int n = sc.nextInt();
        System.out.println(search3(nums,n));
        System.out.println("Index: "+search(nums,n));
        System.out.println(search2(nums,n));

    }
    // Search the target and return the index
    static int search(int arr[],int target){
        if(arr.length==0) return -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    // Search the target and return the element
    static int search2(int arr[],int target){
        if(arr.length==0) return Integer.MAX_VALUE;
        for(int element: arr){
            if(element==target) return element;
        }
        return Integer.MAX_VALUE;
    }
    // Search the element and retrun true if present and false if not present
    static boolean search3(int arr[], int target){
        if(arr.length==0) return false;
        for(int element: arr){
            if(element==target) return true;
        }
        return false;
    }
}