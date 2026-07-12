class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sum += 1;
            }
            if (arr[i] == 0) {
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}