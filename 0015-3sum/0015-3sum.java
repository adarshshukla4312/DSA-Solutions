class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<>();
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = -nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int need = target - nums[j];

                if (hs.contains(need)){
                    List<Integer> triplet = Arrays.asList(nums[i], need, nums[j]);
                    ans.add(triplet);
                }
                hs.add(nums[j]);
            }
            hs.clear();
        }
        return new ArrayList<>(ans);
    }
}