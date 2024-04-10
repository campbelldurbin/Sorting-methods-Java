package L4Part1;
// Java implementation of recursive Binary Search
class BinarySearch {
	// Returns index of x if it is present in arr[l..
	// r], else return -1
	
	System.out.println("Campbell Durbin");
	
	int binarySearch(int arr[], int l, int r, int x) {
		int mid = l + (r - l) / 2;
		System.out.println();
		System.out.println("Find the middle of the array");
		System.out.println("To be: " + arr[mid]);

		System.out.println();

		if (r >= l) {
			// If the element is present at the
			// middle itself
			if (arr[mid] == x) {
				System.out.println("Compare " + arr[mid] + " to " + x);
				System.out.println("The elements are the same!");
				System.out.println();

				return mid;
			}
			// If element is smaller than mid, then
			// it can only be present in left subarray
			else if (arr[mid] > x) {
				System.out.println("Compare " + arr[mid] + " to " + x);
				System.out.println(arr[mid] + " is bigger then " + x);
				System.out.println();
				System.out.println("The middle of the array changes one back: ");
				System.out.println("From " + arr[mid] + " to " + (arr[mid]-1));

				return binarySearch(arr, l, mid - 1, x);
			}
			// Else the element can only be present
			// in right subarray

			else {
				System.out.println("Compare " + arr[mid] + " to " + x);
				System.out.println(arr[mid] + " is smaller then " + x);
				System.out.println();
				System.out.println("The middle of the array changes one further: ");
				System.out.println("From " + arr[mid] + " to " + (arr[mid]-1));

				return binarySearch(arr, mid + 1, r, x);
			}
		}


		// We reach here when element is not present
		// in array
		return -1;
	}


	// Driver method to test above
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = {1, 3, 4, 10, 40 };

		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("The array is: ");
		printArray(arr);


		int n = arr.length;
		int x = 2;

		System.out.println();
		System.out.print("The element that we need to find: ");
		System.out.println(x);
		System.out.println("-------------------------------------");


		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	public static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
/* This code is contributed by Rajat Mishra */
