package Arrays;

public class MaxSubarraySum {
	public static void main(String[] args) {
		int[] arr = new int[] {5, 3, -5, -4, -1, 5, 6, -1, -2, 7, -4, 4};
		int n = arr.length;
		
		// Kadane's Algorithm
		long maxSum = 0, currSum = 0;
		for (int i = 0; i < n; i++) {
			currSum += arr[i];
			if (currSum > maxSum) 
				maxSum = currSum;
			
			if (currSum < 0) 
				currSum = 0;
		}
		System.out.println(maxSum);
	}
}
