package DSA_Interview_Questions.Arrays;

public class SearchEle_SandR_Array 
{
	public static void Search(int[] arr, int x)
	{
		int s = 0, e = arr.length - 1, idx = -1;
		while(s <= e)
		{
			int mid = s + (e - s)/ 2;
			if(arr[mid] == x)
			{
				idx = mid;
				break;
			}
			
			if(arr[s] <= arr[mid]) // sorted
			{
				if(x >= arr[s] && arr[mid] > x)
					e = mid - 1;
				else 
					s = mid + 1;
			}
			else
			{
				if(x <= arr[e] && arr[mid] < x)
					s = mid + 1;
				else 
					e = mid - 1;

			}
		}
		if(idx == -1)
			System.out.println(x + " is not present in the array");
		else
			System.out.println(x + " is present in the array at index " + idx);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {8, 10, 15, 2, 4, 7};
		int x = 15;
		Search(arr, x);
	}
}