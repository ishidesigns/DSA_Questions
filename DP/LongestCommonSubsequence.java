package DP;

public class LongestCommonSubsequence 
{
	public static void main(String[] args) {
		String s1 = "abcdef";
		String s2 = "bcdghcdefab";
		
		System.out.println("LCS using Recursion: " + longest(s1, s2, s1.length(), s2.length())); 

		// dp is used to overcome TLE
		System.out.println("LCS using DP: " + lcs(s1, s2));
	}

	static int longest(String s1, String s2, int l1, int l2) 
	{
		if(l1 == 0 || l2 == 0) return 0;
		
		if(s1.charAt(l1 - 1) == s2.charAt(l2 - 1))
			return longest(s1, s2, l1 - 1, l2 - 1) + 1;
		else
			return Math.max(longest(s1, s2, l1 - 1, l2), longest(s1, s2, l1, l2 - 1));
	}
	
	static int lcs(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int [][]arr = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(text1.charAt(i - 1) == text2.charAt(j - 1))
                    arr[i][j] = 1 + arr[i - 1][j - 1];
                else
                    arr[i][j] = Math.max(arr[i - 1][j],arr[i][j - 1]);
            } 
        }
        return arr[m][n];
    }
}
