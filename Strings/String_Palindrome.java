package DSA_Interview_Questions.Strings;

public class String_Palindrome 
{
	public static void main(String[] args) 
	{
		String str = "abceeba";
		
		if(checkPalindrome(str))
			System.out.println("String is a Palindrome");
		else
			System.out.println("String is not a palindrome");
	}
	
	static boolean checkPalindrome(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}
}
