import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        int []nums={1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct =nums[i]-1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int []arr, int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
