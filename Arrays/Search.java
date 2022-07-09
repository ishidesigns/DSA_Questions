package Arrays;

import java.util.*;

public class Search 
{
	public static void main(String[] args) 
	{
		int[] arr1 = new int[] {7, 9, 4, 1, 0, 5};
		int num1 = 1;
		linearSearch(arr1, num1);
		
		
		int[] arr2 = new int[] {3, 7, 9, 13, 18, 25};
		int num2 = 18;
		binarySearch(arr2, num2);
	}
	
	// Linear Search
	static void linearSearch(int[] arr, int num)
    {
        int size = arr.length;
        int x = 0;
        for(int i = 0; i < size; i++)
        {
            if(arr[i] == num)
            {
                System.out.println(num + " is present at index " + i);
                x = 1;
                break;
            }
        }
        if(x == 0)
            System.out.println(num + " is not present");
    }
    
    
	// Binary Search
    static void binarySearch(int[] arr, int num)
    {
        Arrays.sort(arr); // [1, 8, 9, 10, 12, 15]
        int start = 0, end = arr.length - 1;
        boolean flag = false;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == num)
            {
                System.out.println(num + " is present in array at index " + mid);
                flag = true;
                break;
            }
            else if(arr[mid] > num)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        if(flag == false)
        {
            System.out.println(num + " is not present in array");
        }
    }
}

