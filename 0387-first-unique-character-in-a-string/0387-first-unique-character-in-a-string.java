class Solution {
    public int firstUniqChar(String s) {
       char[] arr =  s.toCharArray();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0)+1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hmap.get(arr[i])==1){
                return i;
            }
        }
        return -1; 
    }
}