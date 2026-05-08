public class SearchIn2DArray {
    public static void main(String[] args) {
        int arr[][]={
        {23, 4, 1},
        {18, 12, 3, 9},
        {78, 99, 34, 156},
        {18, 12}
        };
        //int target=66;
        //System.out.println(search(arr,target));
        System.out.println(find_max(arr));
    }

    static int find_max(int [][] arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max) max=arr[i][j];
            }
        }
        return max;
    }
    // static boolean search(int arr[][],int target){
    //     if(arr.length==0) return false;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].length;j++){
    //             if(arr[i][j]==target) return true;
    //         }
    //     }
    //     return false;
    // }
}
