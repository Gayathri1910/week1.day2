package assignment2.day2;

public class ArrayDuplicates {
	
	public static void main(String[] args) {
		int[] arr = {32,59,12,98,12,478,562,478,971,562,31 };

		// get the length of the array

		int Length=arr.length;

		System.out.println("Length Of the array is :"+Length);

		System.out.println("Duplicate elements are :");



// declare an int variable named count

		int count;

		

		// iterate from 0 to the array length-1 (outer loop starts here)

		for (int i = 0; i < arr.length-1; i++) {

			// assign 0 to count 

count=0;



// iterate from i to the length of the array by adding 1 to it (inner loop starts here)

for (int j = i+1; j < arr.length-1; j++) {

	

	// compare both the loop variables & check they're equal

if(arr[i]==arr[j]) {



// increase the count if both the arrays are equal

count++;}

}

// Out of the inner loop, check and print the first array variable if count is more than 0

if(count>0)

	System.out.println(arr[i]);

		}

			

		

	}

}
