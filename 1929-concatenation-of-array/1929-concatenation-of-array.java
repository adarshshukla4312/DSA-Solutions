class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int k = 0; 
        for(int i = 0; i<arr.length; i++){
            
            if(i==n){
                k = 0;
            }
            arr[i] = nums[k];
            k++;
        }
        return arr;
    }
}