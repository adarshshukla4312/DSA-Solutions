class Solution {
    public int majorityElement(int[] nums) {
        int a = nums.length/2;
        Arrays.sort(nums);

        return nums[a];
    }
}