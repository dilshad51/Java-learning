/*https://leetcode.com/problems/build-array-from-permutation/ */
import java.util.Arrays;
class Get {
    public static void main(String[] args) {
        int []arr={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    public static int[] buildArray(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
}