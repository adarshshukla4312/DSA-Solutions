class Solution {
    public int findNumbers(int[] nums) {
        int numeven =0; 
        for(int i =0; i<nums.length; i++){
            int count =0; 
            int a = nums[i];
            while(a!=0){
                a = a/10;
                count++;
            }
            if(count%2==0){
                numeven++;
            }
        }
        return numeven;
    }
}