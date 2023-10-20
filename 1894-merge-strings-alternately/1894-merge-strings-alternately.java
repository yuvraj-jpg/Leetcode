class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = Math.min(word1.length(),word2.length());
        String ans = "";
        for(int i = 0; i < n; i++) {
            ans = ans + word1.charAt(i) + word2.charAt(i); 
        }
        if (word1.length() > word2.length()) {
             ans = ans + word1.substring(n);
        } 
        if (word1.length() < word2.length()) {
            ans = ans + word2.substring(n);
        }
        return ans;
    }
}