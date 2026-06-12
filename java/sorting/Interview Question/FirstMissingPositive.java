import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int []nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1) return i+1;
        }
        return nums.length+1;
    }
    static void swap(int []arr, int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
