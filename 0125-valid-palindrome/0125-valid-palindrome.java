class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int j = arr.length-1;
        for(int i=0; i<j; ){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}