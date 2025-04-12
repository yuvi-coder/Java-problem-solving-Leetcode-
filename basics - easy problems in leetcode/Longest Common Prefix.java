class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);    // The sort() method sorts an array in ascending order.
                              //This method sorts arrays of strings alphabetically, and arrays of integers numerically.
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){   // condition of the loop ?
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);      // Is this line prints empty string if there is no string elements in the original string s1 ?.
    }
}
