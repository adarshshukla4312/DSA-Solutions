class Solution {
    public static boolean consistsEntirelyOf(ArrayList<Character> list, char target) {
        if (list == null || list.isEmpty()) return false;

        for (Character c : list) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
    public static int lengthOfLongestSubstring(String s) {

        char[] arr = s.toCharArray();
        int count;
        int maximum = 0;
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Character> win = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {

                if (consistsEntirelyOf(win, arr[j])) {
                    break;
                }

                win.add(arr[j]);
            }

            maximum = Math.max(maximum, win.size());
        }
        return maximum;
    }
}