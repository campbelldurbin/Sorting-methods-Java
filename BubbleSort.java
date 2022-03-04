package L4Part1;

// Java program for implementation of Bubble Sort
class BubbleSort 
{ 
	void bubbleSort(int arr[]) 
	{ 
		int n = arr.length;
		System.out.println();
		System.out.println("The initial array: ");
		printArray(arr);

		for (int i = 0; i < n-1; i++) {
			System.out.println();
			System.out.println("-------------------------------------------------");
			System.out.println("                    Loop " + (i+1));
			System.out.println("-------------------------------------------------");


			for (int j = 0; j < n - i - 1; j++) {
				System.out.println();
				System.out.println("Compare numbers: " + arr[j] + " " + arr[j + 1]);
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					System.out.println();
					System.out.println("The number " + arr[j + 1] + " is bigger then " + temp + " so we swap it:");
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				} else {
					System.out.println();
					System.out.println("The number " + arr[j] + " is smaller then " + arr[j + 1] + " - no action");
				}
				printArray(arr);
				System.out.println("-------------------------------------------------");

			}
		}
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println("The sort is complete!");
		System.out.println("-------------------------------------------------");

	} 

	/* Prints the array */
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BubbleSort ob = new BubbleSort(); 
		int arr[] = {64, 34, 25, 12, 22, 11, 90};

		ob.bubbleSort(arr);
		System.out.println();
		System.out.println("Sorted array: ");
		ob.printArray(arr);
		System.out.println();
	} 
} 
/* This code is contributed by Rajat Mishra */
