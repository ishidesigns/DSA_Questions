package DSA_Interview_Questions.Arrays;

public class Sort012 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		arr = new int[] {2, 2, 1, 1, 0, 1, 0, 0, 0, 2};
        int n = arr.length;
        
        sort012(arr, n);
        for(int i : arr)
        	System.out.print(i + " ");
	}
	
	static void sort012(int[] arr, int n)
    {
        int left = 0, right = n - 1, k = 0;
        
        while(k <= right)
        {
            if(arr[k] == 0)
            {
                swap(arr, left, k);
                left++;
                k++;
            }
            
            else if(arr[k] == 2)
            {
                swap(arr, right, k);
                right--;
            }
            else
                k++;
        }
    }
    
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
