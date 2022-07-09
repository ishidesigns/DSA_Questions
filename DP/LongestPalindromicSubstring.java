package DSA_Interview_Questions.DP;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
        String s = "babadabba";
        System.out.print(longestPalindromicSubstring(s));
    }
    
    static String longestPalindromicSubstring(String str){
        if(str.length() < 1 || str == null)
            return "";
            
        int s = 0, e = 0;
        for(int i = 0; i < str.length() - 1; i++)
        {
            int len1 = longest(str, i, i);
            int len2 = longest(str, i, i+1);
            int maxLen = Math.max(len1, len2);
            if(maxLen > e - s)
            {
                s = i - (maxLen - 1)/2;
                e = i + maxLen / 2;
            }
        }
        return str.substring(s, e +1);
    }
    
    static int longest(String s, int left, int right)
    {
        int n = s.length();
        int l = left, r = right;
        while(l >= 0 && r < n && s.charAt(l) == s.charAt(r))
        {
            l--;
            r++;
        }
        return r - l - 1;
    }
}
