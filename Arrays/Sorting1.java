package DSA_Interview_Questions.Arrays;

public class Sorting1
{
	public static void main(String[] args) {
		int[] arr1 = new int[] {5, 4, 3, 2, 1};
		int size1 = arr1.length;
		bubbleSort(arr1, size1);
		
		int[] arr2 = new int[] {7, 9, 3, 5, 2, 0};
		int size2 = arr2.length;
		selectionSort(arr2, size2);
		
		int[] arr3 = new int[] {8, 1, 7, 4, 11, 15};
		int size3 = arr3.length;
		insertionSort(arr3, size3);
	}
	
	// Insertion Sort
	static void insertionSort(int[] arr, int size) 
	{
		for(int i = 1; i < size; i++)
		{
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key)
			{
			    arr[j + 1] = arr[j];
			    j--;
			}
			arr[j + 1] = key;
		}
		
		for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
	}

	// Bubble Sort
	static void bubbleSort(int[] arr, int size)
    {
        for(int i = 0; i < size - 1; i++)
        {
            for(int j = 0; j < size - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
	// Selection Sort
    static void selectionSort(int[] arr, int size)
    {
        for(int i = 0; i < size - 1; i++)
        {
            int minIndex = i;
            for(int j = i+1; j < size; j++)
            {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
}