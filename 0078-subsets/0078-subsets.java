class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < (1 << nums.length); i++) {
            int j = nums.length - 1;
            int num = i;
            List<Integer> subset = new ArrayList<>();
            while (num > 0) {
                if ((num & 1) == 1) {
                    subset.add(0, nums[j]);
                }
                num = num >> 1;
                j--;
            }
            list.add(subset);
        }
        return list;
    }
}