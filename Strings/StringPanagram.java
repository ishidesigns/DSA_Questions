package DSA_Interview_Questions.Strings;

public class StringPanagram 
{
	public static void main(String[] args) {
		String str1 = "ThE qUIck, bRowN fOx jumPs ovEr a, lAzy Dog";
		String str2 = "zfsh tfjnjkkg uihcb fSFSjbvn GDFsddsv ZfdgdfgTY ";
		
		checkPanagram(str1);
		checkPanagram(str2);
		
	}
	static void checkPanagram(String str)
	{
		str = str.toLowerCase();
		
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if((int)ch >= 97 && (int)ch <= 122)
			{
				arr[ch - 'a']++;
			}
		}
		boolean flag = true;
		for(int i = 0; i < 26; i++)
		{
			if(arr[i] == 0)
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println("String is a panagram");
		else
			System.out.println("String is not a panagram");
	}
}
