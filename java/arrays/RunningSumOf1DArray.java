/* https://leetcode.com/problems/running-sum-of-1d-array/ */
import java.util.Arrays;
import java.util.Scanner;
class RunningSumOf1DArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    public static int[] runningSum(int[] nums) {
        int [] arr=new int[nums.length];
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+nums[i];
            arr[i]= sum;
        }
        return arr;
    }
}