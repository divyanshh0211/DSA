class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int left = 0 ;
        int right = 0 ;
        int maxLen = 0 ;

        int [] freq = new int[256];


        while(right<n){
            char ch = s.charAt(right);
            freq[ch]++;

            while(freq[ch]>1){
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen , right-left+1);
            right++;


        }
        return maxLen;
        
    }
}