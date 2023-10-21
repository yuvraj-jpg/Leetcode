class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String x = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ') {
                x = x + s.charAt(i);
            } else {
                    ans = x + ans;
                    x = "";
            }
            if (ans.length() > 0 && ans.charAt(0) != ' ') {
                ans = ' ' + ans;
            }
        } 
        ans = x + ans;
        return ans.trim();
    }
}