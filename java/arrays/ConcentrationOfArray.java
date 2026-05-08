/*https://leetcode.com/problems/concatenation-of-array/ */
import java.util.Arrays;
import java.util.Scanner;
class ConcentrationOfArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n= sc.nextInt();
        int arr[]=new int [n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    public static int[] getConcatenation(int[] nums) {
        int [] arr=new int [2*nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }

}