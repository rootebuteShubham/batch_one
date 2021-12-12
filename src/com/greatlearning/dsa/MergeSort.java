package com.greatlearning.dsa;

public class MergeSort {

	void merge(int arr[],int left, int mid,int right) {
		// Find sizes of the two sub arrays(left and right) to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		// Create temporary arrays (Left and Right)
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		
		// Copy data to temporary arrays
		for(int i = 0; i<n1; i++) {
			leftArray[i] = arr[left+i];
		}
		for(int j = 0; j<n2; j++) {
			rightArray[j] = arr[mid+1+j];
		}
		
		// Merge temporary arrays
		int i = 0, j = 0; 
		int k = left;
		
		while(i < n1 && j < n2) {
			if(leftArray[i] < rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
		}
		k++;
	}
		
		// Merge the remaining elements from leftArray to main array arr
		while(i<n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		// Merge the remaining elements from rightArray to main array arr
		while(j<n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
		
	}
	
	
	void sort(int arr[],int left,int right) {
		
		if(left<right) {
			int mid  = (left+right)/2;
			System.out.println("The mid element is "+mid);
			// Sort first and second halves
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			
			
			// merge the sorted halves
			merge(arr,left,mid,right);
		}
		
	}
}
