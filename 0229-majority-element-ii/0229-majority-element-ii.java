class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int num: nums) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
        }
        int crit = nums.length/3;
        for (int num: nums) {
            if (hmap.get(num) > crit){
                hs.add(num);
            }
        }
        return new ArrayList<>(hs);
    }
}