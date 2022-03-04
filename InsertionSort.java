package L4Part1;

// Java program for implementation of Insertion Sort
class InsertionSort { 
	/*Function to sort array using insertion sort*/
	void sort(int arr[]) {
		int n = arr.length; 
		for (int i = 1; i < n; ++i) { 
			int key = arr[i]; 
			int j = i - 1; 

			/* Move elements of arr[0..i-1], that are 
			greater than key, to one position ahead 
			of their current position */
			while (j >= 0 && arr[j] > key) {

				System.out.println("Interchange " + arr[j] + " with " + arr[j+1]);
				arr[j + 1] = arr[j];
				j = j - 1;


			}
			arr[j + 1] = key;
			if(j < 0){
				System.out.println();
				System.out.println("Changed array:");
				printArray(arr);
				System.out.println();
				System.out.println("----------------------------");
				System.out.println();

			}


		}

	} 

	/* A utility function to print array of size n*/
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = { 12, 11, 13, 5, 6 };

		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		System.out.print("The initial array: ");
		printArray(arr);
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();


		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		System.out.println();
		System.out.println("----------------------------");
		System.out.println();
		System.out.print("The final array: ");
		printArray(arr);
		System.out.println();
		System.out.println("----------------------------");
		System.out.println();

	}
} /* This code is contributed by Rajat Mishra. */
