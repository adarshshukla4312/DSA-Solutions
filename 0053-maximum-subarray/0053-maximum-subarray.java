class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int num: nums){
            currentsum += num;
            if(currentsum > maxsum){
                maxsum = currentsum;
            }
            if(currentsum < 0){
                currentsum = 0;
            }

        }System.gc();
        return maxsum;
    }
}