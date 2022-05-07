package DSA_Interview_Questions.Arrays;
import java.util.*;
public class MedianOf2SortedArrays 
{
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[] {2,5,6,7,12};
		// 1 2 2 3 4 5 5 6 7 12
//		double median = findMedian(arr1, arr2);
//		System.out.print(median); // 4.5
		
		arr1 = new int[]{1, 5};
		arr2 = new int[]{8};
		double median = findMedian(arr1, arr2);
		System.out.printf("%.2f", median);
	}
	
	static double findMedian(int[] arr1, int[] arr2)
	{
		// we assume arr1 of smaller size
		int m = arr1.length;
		int n = arr2.length;
		
		if(m > n)
			return findMedian(arr2, arr1);
		int s1 = 0, e1 = m;
		
		while(s1 <= e1)
		{
			// find middle of arr1
			int mid1 = (s1 + e1)/2;
			
			// middle of arr2
			int mid2 = (m + n + 1)/2 - mid1;
			
			// if mid1 == 0 assume leftMax1 as -infinity
			int leftMax1 = (mid1 == 0) ? Integer.MIN_VALUE : arr1[mid1 - 1];
			// if mid1 == m assume rightMin1 as +infinity
			int rightMin1 = (mid1 == m) ? Integer.MAX_VALUE : arr1[mid1];
			
			// if mid2 == 0 assume leftMax2 as -infinity
			int leftMax2 = (mid2 == 0) ? Integer.MIN_VALUE : arr2[mid2 - 1];
			// if mid2 == n assume rightMin2 as +infinity
			int rightMin2 = (mid2 == n) ? Integer.MAX_VALUE : arr2[mid2];
			
			if(leftMax1 <= rightMin2 && leftMax2 <= rightMin1)
			{
				if((m + n) % 2 == 0)
				{
					int leftMax = Math.max(leftMax1, leftMax2);
					int rightMin = Math.min(rightMin1, rightMin2);
					return (double)(leftMax + rightMin) / 2;
				}
				else
				{
					int leftMax = Math.max(leftMax1, leftMax2);
					return (double)leftMax;
				}
			}
			
			// more elements from arr2 to be shifted to left part
			else if(leftMax1 > rightMin2)
				e1 = mid1 - 1;
			
			// more elements from arr1 to be shifted to right part
			else
				s1 = mid1 + 1;
		}
		return 0;
	}
}


