package DSA_Interview_Questions.Arrays;

public class Second_Low_High {
	public static void main(String[] args) 
	{
		int[] arr = new int[]{1, 2, 3, 6, 5, 8, 7, 2, 6, 7, 6, 7};
		secondLargestandLowest(arr);
	}
	
	static void secondLargestandLowest(int[] arr)
    {
        int firstLow = Integer.MAX_VALUE, secLow = Integer.MAX_VALUE;
        int firstHigh = Integer.MIN_VALUE, secHigh = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++)
        {
            firstLow = Math.min(firstLow, arr[i]);
            firstHigh = Math.max(firstHigh, arr[i]);
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != firstLow)
            {
                secLow = Math.min(secLow, arr[i]);   
            }
            if(arr[i] != firstHigh)
            {
                secHigh = Math.max(secHigh, arr[i]);   
            }
        }
        
        System.out.println("Second Lowest: " + secLow + "\nSecond Highest: " + secHigh);
    }
}
