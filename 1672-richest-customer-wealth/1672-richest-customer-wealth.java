class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum = 0;
        for (int[] row: accounts) {
            int sum =0;
            for (int element: row) {
                sum +=element;
                if (sum>maximum){
                    maximum = sum;
                }
            }
        }
        return maximum;
    }
}