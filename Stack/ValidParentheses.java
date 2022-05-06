package DSA_Interview_Questions.Stack;

import java.util.*;

public class ValidParentheses 
{
	public static void main(String[] args) {
		String str1 = "()()()";
		String str2 = "(){}[[]";
		
		System.out.println(valid(str1));
		System.out.println(valid(str2));
	}
	
	static boolean valid(String str)
	{
		HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']', '[');
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            if(map.containsKey(ch))
            {
                if(st.isEmpty()) 
                	return false;
                char bracket = st.pop();
                if(bracket != map.get(ch))
                {
                    return false;
                }
            }
        }
		
		if(st.isEmpty())
			return true;
		return false;
	}
}
