import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int []arr={0,3,1,5,2};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i) return i;
        }
        return nums.length;
    }
    static void swap(int [] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

