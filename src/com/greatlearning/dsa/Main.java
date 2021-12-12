package com.greatlearning.dsa;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		// Take an input array from the user
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the "+size+ " elements");
		
		for(int i = 0; i < size;i++) {
			array[i] = sc.nextInt();
		}
		
		
		// Call your merge sort algorithm to sort an input array
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(array, 0, array.length-1);
		
		System.out.println("Array after sorting is");
		
		for(int i = 0; i< size;i++) {
			System.out.print(array[i] + " ");
		}
		
		// Call the function for rotation
		int midElement = (array.length/2) + 1;
		ArrayRotation arrayRotation = new ArrayRotation();
		arrayRotation.leftRotate(array, midElement, array.length);
		
		System.out.println("Array after rotation is");
		
		for(int i = 0; i< size;i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		ModifiedBinarySearch pivotedBinarySearch = new ModifiedBinarySearch();
		int index = pivotedBinarySearch.pivotedBinarySearch(array,array.length,key);
		System.out.println("key is found at position "+ (index+1));
		
	}
}
