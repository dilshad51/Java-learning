// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth{
    public static void main(String[] args){
        int[][] arr = {
        {1, 5},
        {7, 3},
        {3, 5}
};


        System.out.println(find(arr));
    }

    static int find(int [][]arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int add=0;
            for(int j=0;j<arr[i].length;j++){
                add+=arr[i][j];
            }
            if(max<add) max=add;
        }
        return max;
    }
}