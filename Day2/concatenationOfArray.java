class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];

        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
        }

        for(int i = n; i < 2 * n; i++){
            arr[i] = nums[i - n];
        }

        // single loop

        // for(int i = 0; i < 2 * n; i++){
        //     if(i < n){
        //          arr[i] = nums[i];
        //          continue;
        //     }
        //     arr[i] = nums[i - n];
        // }

        return arr;
    }
}
