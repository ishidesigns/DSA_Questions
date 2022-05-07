package DSA_Interview_Questions.Hashing;

import java.util.*;
public class MaxFreqElement 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1, 2, 3, 6, 5, 8, 7, 2, 6, 7, 6, 7};
        maxFreq(arr);
	}
	static void maxFreq(int[] arr)
    {
        Map<Integer, Integer> map = new TreeMap<>(); 
        int maxVal = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            if(map.containsKey(num))
            {
                map.put(num, map.get(num) + 1);
                maxVal = Math.max(maxVal, map.get(num));
            }
            else
            {
                map.put(num, 1);
                maxVal = Math.max(maxVal, map.get(num));
            }
        }
        
        System.out.println(maxVal); 
        System.out.println(map);
        int ans = Integer.MIN_VALUE;
        for(Map.Entry e : map.entrySet())
        {
            if((int)e.getValue() == maxVal)
            {
                ans = Math.max(ans, (int)e.getKey());
            }
        }
        System.out.println(ans);
    }
}
