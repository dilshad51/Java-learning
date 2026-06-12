import java.util.*;
public class FindErrorNums {
    public static void main(String[] args) {
        int [] nums={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1) return new int[]{nums[i],i+1};
        }
        return new int[]{-1,-1};
    }
    static void swap(int []arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
