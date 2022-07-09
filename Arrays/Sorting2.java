package Arrays;

public class Sorting2 
{
	public static void main(String[] args) 
	{
		int[] arr1 = new int[] {7, 9, 3, 5, 2, 0};
		int size1 = arr1.length;
		System.out.println("Applying Quick Sort to arr1 \nBefore");
		printArr(arr1, size1);
		quickSort(arr1, 0, size1 - 1);
		System.out.println("After");
		printArr(arr1, size1);
		System.out.println("---------------------");
        
        int[] arr2 = new int[] {8, 1, 7, 4, 11, 15};
		int size2 = arr2.length;
		System.out.println("Applying Merge Sort to arr2 \nBefore");
		printArr(arr2, size2);
		mergeSort(arr2, 0, size2 - 1);
		System.out.println("After");
		printArr(arr2, size2);
		System.out.println("---------------------");
	}
	
	// Quick Sort
	public static void quickSort(int[] arr, int start, int end)
	{
		if(start < end)
		{
			int pivot_index = partition(arr, start, end);
			quickSort(arr, start, pivot_index - 1);
			quickSort(arr, pivot_index + 1, end);
		}
	}
	
	// finding pivot index
	public static int partition(int[] arr, int start, int end) 
	{
		int pivot = arr[end];
		int i = start - 1;
		for(int j = start; j <= end - 1; j++)
		{
			if (arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, end);
		return(i + 1);
	}
	
	// Swap function
	public static void swap(int[] arr, int i, int j)
	{
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	// Merge Sort
	public static int[] mergeSort(int arr[], int start, int end)
    {
        if(start < end) 
        {
            int mid = start + (end - start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
        return arr;
    }
	
	// Merge two sorted arrays function
	public static void merge(int arr[], int start, int mid, int end)
	{
	    int l = mid - start + 1; 
	    int r = end - mid;
	    int left[] = new int[l];
	    int right[] = new int[r];
	
	    for(int i = 0; i < l; i++)
	    {
	        left[i] = arr[start + i];
	    }
	    for(int i = 0; i < r; i++)
	    {
	        right[i] = arr[mid + 1 + i];
	    }
	
        int i = 0;
        int j = 0;
        int k = start;

        while(i < l && j < r)
        {
            if(left[i] < right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
            	arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        while(i < l)
        {
			arr[k] = left[i];
			i++;
			k++; 
        }
        while(j < r)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
	}
	
	// Printing array
	static void printArr(int[] arr, int n)
	{
		for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
		System.out.println();
	}
}
