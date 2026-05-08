public class SplitArray {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] nums, int k) {
        int s=0,e=0;
        for(int i=0;i< nums.length;i++){
            s=Math.max(s,nums[i]); // at the end of the loop it will contain the largest element in the array
            e+=nums[i]; // it will contain sum of all the values
        }
        while (s<e) {
            int mid=s+(e-s)/2;
            // calculate number of pieces i can divide it with this max sum
            int sum=0;
            int pieces = 1;
            for( int num : nums){
                if(sum+num > mid){
                    sum=num;
                    pieces++;
                }else{
                    sum+= num;
                }
            }
            if(pieces>k) s=mid+1;
            else e=mid;

        }
        return e; // here s==e
        
    }
}
