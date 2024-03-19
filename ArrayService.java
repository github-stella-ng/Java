package toBeCompleted;

public class ArrayService {
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the first index at which target exists
	 * in array data, -1 if it doesn't
	 * 
	 * return -1 if array is null or empty.
	 */
	public static int indexOf(int[] data, int target) {
		if (data == null || data.length == 0) {
			return -1;
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i] == target)
				return i;
		}
		return -1; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @param item
	 * @return the number of times target appears in the array data
	 * 
	 * return 0 if array is null or empty.
	 */
	public static int countOccurrences(int[] data, int target) {
		if (data == null || data.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i <data.length; i++) {
			if(data[i]== target){
				count ++;//-100 is just a placeholder to satisfy the "contract", to be completed
			}
		}
		return count;
	}
	
	/**
	 * 
	 * @param data
	 * @return the highest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int max(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		}
		int max = data[0];
		for (int i = 1; i <data.length; i++) {
			if (data[i]> max) {
				max = data[i];
			}
		}
		return max; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @return the smallest item in the array.
	 * return 0 if array is null or empty.
	 */
	public static int min(int[] data) {
		if (data == null || data.length == 0) {
			return 0;
		}
		int min = data[0];
		for (int i = 1; i <data.length; i++) {
			if (data[i]< min) {
				min= data[i];
			}
		}
		return min;  //-100 is just a placeholder to satisfy the "contract", to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the difference between the highest and the lowest
	 * item of the array.
	 * return 0 if array is null or empty.
	 */
	public static int diff(int[] data) {
		 if(data == null || data.length == 0) {
			 return 0;
		 }
		 int highest = data[0];
		 int lowest = data[0];

		 for(int i = 1; i < data.length; i++) {
			 if(data[i] < lowest) {
				 lowest = data[i];
		 }

		 if(data[i] > highest) {
		 highest = data[i];
		}
		 }
		 return highest - lowest;
	}
	/**
	 * 
	 * @param data
	 * @return true if array is sorted in ascending order.
	 * EXAMPLE: {10, 10, 15} is in ascending order 
	 * (even though not in STRICTLY ascending order), so the 
	 * function must return true for array {10, 10, 15}	 
	 * return false if array is null
	 * return true if array is empty or has a single item (vacuous truth)
	 */
	public static boolean isAscending(int[] data) {
		if (data == null) {
			return false;
		}
		if (data.length <=1) {
			return true;
		}
		for (int i = 0; i <data.length-1; i++) {
			if (data[i] > data[i+1]) {
				return false ;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return true if array is sorted in descending order.
	 * EXAMPLE: {10, 10, 5} is in descending order 
	 * (even though not in STRICTLY descending order), so the 
	 * function must return true for array {10, 10, 5}
	 * return false if array is null
	 * return true if array is empty or has a single item (vacuous truth)
	 */
	public static boolean isDescending(int[] data) {
		if (data == null) {
			return false;
		}
		if (data.length == 0 || data.length == 1) {
			return true;
		}
		for (int i = 0; i <data.length-1; i++) {
			if (data[i]< data[i+1]) {
				return false;
			}
		}
		return true; //to be completed
	}

	/**
	 * 
	 * @param data
	 * @return the average of the array.
	 * return 0 if array is null or empty.
	 */
	public static double average(int[] data) {
		if (data == null || data.length ==0) {
			return 0;
		}
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		double ans = sum/data.length;
		return ans; //-100 is just a placeholder to satisfy the "contract", to be completed
	}
	
	/**
	 * 
	 * @param data
	 * @return an ascending order sorted version of data
	 * IMPORTANT: the parameter array itself should NOT be modified
	 *
	 * return null array if array is null
	 * return empty array if array is empty
	 */
	public static int[] sorted(int[] data) {
		// Check for null or empty array
		if(data == null) {
			 return null;
		}
		if (data.length == 0) {
			return new int[0];
		}
		// Create a sorted array
		int[] ans = new int [data.length];
		for (int i = 0; i < data.length; i++) {
	        ans[i] = data[i];
	    }
		for (int i = 0; i <ans.length; i++) {
			for (int j = i + 1;j< ans.length; j++) {
				if (ans [i]>ans[j]) {
					int current = ans[i];
					ans[i]= ans[j];
					ans[j]= current;
				}
			}
		}
 

	    return ans;
	}

	/**
	 * 
	 * @param data
	 * @return the "median" item of the array.
	 * we define median as the item that sits in the middle
	 * when the array is sorted in ascending order.
	 * If the array has an even number of items, use the item to 
	 * the LEFT of the middle parting line.
	 * For example, if the array is {10, 70, 20, 90, 60, 10, 70, 40},
	 * the sorted array is {10, 10, 20, 40, 60, 70, 70, 90}, and the items 
	 * to the left and right of the middle line are 40 and 60.
	 * Thus the function must return 40 in this case.
	 * If the array is {30, 10, 20, 50, 40}, the sorted array is
	 * {10, 20, 30, 40, 50} and the answer is clear: 30
	 * 
	 * return 0 if array is null or empty.
	 */
	public static int median(int[] data) {
		if (data == null || data.length == 0) {
	        return 0;
	    }
		// Create a sorted array
		int[] sorted = new int [data.length]; 
		for (int i = 0; i < data.length; i++) {
	        sorted[i] = data[i]; // Copy data to sorted
	    }
		// Sort the sorted array in ascending order
		for (int i = 0; i < sorted.length; i++) {
	        for (int j = i + 1; j < sorted.length; j++) {
	            if (sorted[i] > sorted[j]) {
	                int n = sorted[i];
	                sorted[i] = sorted[j];
	                sorted[j] = n;
	            }
	        }
	    }
		 int n = sorted.length;

		    if (n % 2 == 1) {
		        return sorted[n / 2];// odd -length array 
		    } else {
		        return sorted[n / 2 - 1];// even-length array
		    }
	    
    }

	/**
	 * 
	 * @param data
	 * @return the most common item in the array.
	 * IMPORTANT: in case of tie, return the item that occurs first in the array
	 * 
	 * return 0 if the array is null or empty
	 */
	public static int mostCommonItem(int[] data) {
		// Check for null or empty array
	    if (data == null || data.length == 0) {
	        return 0;
	    }
	    int mostCommon = 0; 
	    int maxCount = 0; 

	    for (int i = 0; i < data.length; i++) {
	        int currentCount = 0; // Count for the current item
	        for (int j = i; j < data.length; j++) {
	            if (data[j] == data[i]) {
	                currentCount++;
	            }
	        }

	        if (currentCount > maxCount) {
	            mostCommon = data[i];
	            maxCount = currentCount;
	        }
	    }

	    return mostCommon; 
	}
	
	/**
	 * HD - 1
	 * @param data
	 * @return the length of the longest ascending sequence in the array
	 * return 0 if array is null or empty.
	 */
	public static int longestAscendingSequenceLength(int[] data) {
		if (data == null || data.length == 0) {
	        return 0;
	    }
		int currentLength = data[0]; // Length of the current ascending sequence
	    int maxLength = data[0];    // Length of the longest ascending sequence

	    for (int i = 1; i < data.length; i++) {
	        if (data[i] > data[i - 1]) {
	            currentLength++;
	        } else {
	            currentLength = 0; // Reset currentLength if the sequence breaks
	        }

	        // Update maxLength if currentLength is greater
	        if (currentLength > maxLength) {
	            maxLength = currentLength;
	        }
	    }

	    return maxLength;
	}
	
	/**
	 * HD - 2
	 * @param data
	 * @return the starting index of the longest ascending sequence in the array
	 * in case of tie, return the starting index of the first of the tied sequences
	 * return -1 if array is null or empty.
	 */
	public static int longestAscendingSequenceStart(int[] data) {
		 if (data == null || data.length == 0) {
		        return -1;
		    }
		    int longestStart = 0;
		    int currentStart = 0;
		    int maxLength = 1;
		    int currentLength = 1;

	    for (int i = 1; i < data.length; i++) {
	        if (data[i] >= data[i - 1]) {
	            currentLength++;
	            if (currentLength > maxLength) {
	                maxLength = currentLength;
	                longestStart = currentStart;
	            }
	        } else {
	            if (currentLength >= maxLength) {
	                maxLength = currentLength;
	                longestStart = currentStart;
	            }
	            currentStart = i;
	            currentLength = 1;
	        }
	    }

	    // Check if the longest ascending sequence reaches the end of the array
	    if (currentLength >= maxLength) {
	        longestStart = currentStart;
	    }

	    return longestStart;
	}
	
	/**
	 * HD - 3
	 * @param data
	 * @return the longest ascending sequence in the array
	 * in case of tie, return the first of the tied sequences
	 * return null if array is null
	 * return empty array if array is empty
	 */
	public static int[] longestAscendingSequence(int[] data) {
		return new int[0]; //to be completed
	}
}
