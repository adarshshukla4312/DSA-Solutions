class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int element = nums[0];
        int freq = 1;

        for (int i = 1; i < n; i++) {
            if (freq == 0){
                element = nums[i];
                freq++;
            } else if (element == nums[i]) {
                freq++;                
            }else {
                freq--;
            }

        }
        return element;
    }
}