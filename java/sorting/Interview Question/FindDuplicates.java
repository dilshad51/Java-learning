import java.util.*;
public class FindDuplicates {
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
        
    }
    static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]) swap(nums,i,correct);
            else i++;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i] != i+1) list.add(nums[i]);
        }
        return list;
    }
    static void swap(int arr[], int a ,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
