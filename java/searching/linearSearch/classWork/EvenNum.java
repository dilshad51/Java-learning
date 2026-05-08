// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNum {
    public static void main(String[] args){
        int arr[]={12,345,2,6,7896};
        System.out.println(find(arr));
    }

    static int find(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(digits(arr[i])%2==0) count++;
        }
        return count;
    }
    static int digits(int n){
        int ans=(int) (Math.log10(n))+1;
        return ans;
    }
}
