package DSA_Interview_Questions.Stack;

import java.util.*;

public class LongestValidParentheses {
    public static void main(String[] args) {
        String bracket = "(()))()()()";

        int answer = longestValid(bracket);
        System.out.println(answer);
    }

    static int longestValid(String str) {
        if(str == null || str.length() == 0)
            return 0;
        int maxLen = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if(ch == '(')
                st.push(idx);
            else {
                st.pop();
                if(st.isEmpty())
                    st.push(idx);
                else
                    maxLen = Math.max(maxLen, idx - st.peek());
            }
        }
        return maxLen;
    }
}
